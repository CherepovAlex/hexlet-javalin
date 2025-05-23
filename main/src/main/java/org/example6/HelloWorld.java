package org.example6;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

import static io.javalin.rendering.template.TemplateUtil.model;

import org.example6.dto.courses.CoursePage;
import org.example6.dto.courses.CoursesPage;

import java.nio.file.Paths;

public class HelloWorld {
    public static void main(String[] args) {
        var templateEngine = TemplateEngine.create(
                new DirectoryCodeResolver(Paths.get("main/src/main/jte/example6")),
                ContentType.Html
        );
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(templateEngine));
        });

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/courses", ctx -> {
            var courses = Data.getCourses();
            var header = "Programming courses";
            var page = new CoursesPage(courses, header);
            ctx.render("courses/index.jte", model("page", page));
        });

        app.get("/courses/{id}", ctx -> {
            var id = Long.parseLong(ctx.pathParam("id"));
            var course = Data.getCourseById(id);
            if (course == null) {
                ctx.status(404).result("Course not founded");
                return;
            }
            var page = new CoursePage(course);
            ctx.render("courses/show.jte", model("page", page));
        });

        app.start(7070);
    }
}
