package org.example14;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import io.javalin.validation.ValidationException;
import io.javalin.http.NotFoundResponse;

import org.example14.dto.users.BuildUserPage;
import org.example14.dto.users.UsersPage;
import org.example14.dto.users.UserPage;
import org.example14.model.User;
import org.example14.repository.UserRepository;

import java.nio.file.Paths;
import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class App {
    public static void main(String[] args) {
        var templateEngine = TemplateEngine.create(
                new DirectoryCodeResolver(Paths.get("main/src/main/jte")),
                ContentType.Html
        );
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(templateEngine));
        });

        app.get(NamedRoutes.buildUsersPath(), ctx -> {
            var page = new BuildUserPage();
            ctx.render("example14/users/build.jte", model("page", page));
        });

        app.get(NamedRoutes.usersPath(), ctx -> {
            List<User> users = UserRepository.getEntities();
            var page = new UsersPage(users);
            ctx.render("example14/users/index.jte", model("page", page));
        });

        app.get(NamedRoutes.usersPath("{id}"), ctx -> {
            var id = Long.parseLong(ctx.pathParam("id"));
            var user = UserRepository.getEntities().stream()
                    .filter(u -> u.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new NotFoundResponse("User not found"));
            var page = new UserPage(user);
            ctx.render("example14/users/show.jte", model("page", page));
        });

        app.post(NamedRoutes.usersPath(), ctx -> {
            var name = ctx.formParam("name").trim();
            var email = ctx.formParam("email").trim();

            try {
                var passwordConfirmation = ctx.formParam("passwordConfirmation");
                var password = ctx.formParamAsClass("password", String.class)
                        .check(value -> value.equals(passwordConfirmation), "Пароли не совпадают")
                        .check(value -> value.length() > 6, "Пароль должен быть длиннее 6 символов")
                        .get();
                var user = new User(name, email, password);
                UserRepository.save(user);
                ctx.redirect(NamedRoutes.usersPath());
            } catch (ValidationException e) {
                var page = new BuildUserPage(name, email, e.getErrors());
                ctx.render("example14/users/build.jte", model("page", page));
            }
        });

        app.get(NamedRoutes.homePath(), ctx -> ctx.render("example14/index.jte"));

        app.start(7070);
    }
}
