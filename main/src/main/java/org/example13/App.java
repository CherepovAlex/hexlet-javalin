package org.example13;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import io.javalin.validation.ValidationException;

import org.example13.model.Course;
import org.example13.dto.courses.CoursePage;
import org.example13.dto.courses.BuildCoursePage;
import org.example13.repository.CourseRepository;

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

        app.get("/", ctx -> ctx.render("example13/index.jte"));

        app.get(NamedRoutes.coursesPath(), ctx -> {
            List<Course> courses = CourseRepository.getEntities();
            var page = new CoursePage(courses);
            ctx.render("example13/courses/index.jte", model("page", page));
        });

        app.get(NamedRoutes.buildCoursesPath(), ctx -> {
            var page = new BuildCoursePage();
            ctx.render("example13/courses/build.jte", model("page", page));
        });

        app.post(NamedRoutes.coursesPath(), ctx -> {
            var name = ctx.formParam("name").trim();
            var description = ctx.formParam("description").trim();

            try {
                name = ctx.formParamAsClass("name", String.class)
                        .check(value -> value.length() > 2, "Название не должно быть короче двух символов")
                        .check(value -> !CourseRepository.existsByTitle(value), "Курс с таким названием уже существует")
                        .get();
                description = ctx.formParamAsClass("description", String.class)
                        .check(value -> value.length() > 10, "Описание должно быть не короче 10 символов")
                        .get();
                var course = new Course(name, description);
                CourseRepository.save(course);
                ctx.redirect("example13/courses");
            } catch (ValidationException e) {
                var page = new BuildCoursePage(name, description, e.getErrors());
                ctx.render("example13/courses/build.jte", model("page", page));
            }
        });
        app.start(7070);
    }
}
