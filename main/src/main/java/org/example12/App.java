package org.example12;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import io.javalin.validation.ValidationException;

import org.example12.dto.users.BuildUserPage;
import org.example12.model.User;
import org.example12.repository.UserRepository;

import java.nio.file.Paths;

import static io.javalin.rendering.template.TemplateUtil.model;

public class App {
    public static void main(String[] args) {
        var templateEngine = TemplateEngine.create(
                new DirectoryCodeResolver(Paths.get("main/src/main/jte/example12")),
                ContentType.Html
        );
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(templateEngine));
        });

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/users/build", ctx -> {
            var page = new BuildUserPage();
            ctx.render("users/build.jte", model("page", page));
        });

        app.get("/users", ctx -> {
            var users = UserRepository.getEntities();
            ctx.render("users/index.jte", model("users", users));
        });

        app.post("/users", ctx -> {
            var name = ctx.formParam("name").trim();
            var email = ctx.formParam("email").trim().toLowerCase();

            try {
                var passwordConfirmation = ctx.formParam("passwordConfirmation");
                var password = ctx.formParamAsClass("password", String.class)
                        .check(value -> value.equals(passwordConfirmation), "Пароли не совпадают")
                        .check(value -> value.length() > 6, "У пароля достаточная длина")
                        .get();
                var user = new User(name, email, password);
                UserRepository.save(user);
                ctx.redirect("/users");
            } catch (ValidationException e) {
                var page = new BuildUserPage(name, email, e.getErrors());
                ctx.render("users/build.jte", model("page", page));
            }
        });

        app.start(7070);
    }
}
