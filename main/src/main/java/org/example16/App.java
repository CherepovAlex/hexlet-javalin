package org.example16;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

import org.example16.controller.CoursesController;

import java.nio.file.Paths;

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

        app.get(org.example16.NamedRoutes.homePath(), CoursesController::home);
        app.get(org.example16.NamedRoutes.buildCoursesPath(), CoursesController::build);
        app.get(org.example16.NamedRoutes.coursesPath(), CoursesController::index);
        app.get(org.example16.NamedRoutes.coursePath("{id}"), CoursesController::show);
        app.post(org.example16.NamedRoutes.coursesPath(), CoursesController::create);
        app.get(org.example16.NamedRoutes.editCoursePath("{id}"), CoursesController::edit);
        app.post(org.example16.NamedRoutes.updateCoursePath("{id}"), CoursesController::update);
        app.post(org.example16.NamedRoutes.deleteCoursePath("{id}"), CoursesController::destroy);

        app.start(7070);
    }
}
