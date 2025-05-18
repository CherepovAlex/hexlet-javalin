package org.example11;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

import java.nio.file.Paths;
import java.util.Map;

import org.example11.repository.UserRepository;
import org.example11.model.User;

import static io.javalin.rendering.template.TemplateUtil.model;

public class App {
    public static void main(String[] args) {
        var templateEngine = TemplateEngine.create(
                new DirectoryCodeResolver(Paths.get("main/src/main/jte/example11")),
                ContentType.Html
        );
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(templateEngine));
        });

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/users/build", ctx -> {
            ctx.render("users/build.jte");
        });

        app.get("/users", ctx -> {
            var users = UserRepository.getEntities();
            ctx.render("users/index.jte", model("users", users));
        });

        app.post("/users", ctx -> {
            var name = ctx.formParam("name").trim();
            var email = ctx.formParam("email").trim().toLowerCase();
            var password = ctx.formParam("password");
            var passwordConfirmation = ctx.formParam("passwordConfirmation");

            if (!password.equals(passwordConfirmation)) {
                ctx.status(400);
                ctx.result("Passwords do not match");
                return;
            }

            var user = new User(name, email, password);
            UserRepository.save(user);
            ctx.redirect("/users");
        });

        app.start(7070);
    }
}
