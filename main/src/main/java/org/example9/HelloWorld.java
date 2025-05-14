package org.example9;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example9.dto.courses.CoursePage;
import org.example9.dto.courses.CoursesPage;
import org.example9.model.Course;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main(String[] args) {
        var templateEngine = TemplateEngine.create(
                new DirectoryCodeResolver(Paths.get("main/src/main/jte/example9")),
                ContentType.Html
        );
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(templateEngine));
        });

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/courses", ctx -> {
            var term = ctx.queryParam("term");
            var courses = Data.getCourses();
            List<Course> filteredCourses;
            if (term != null && !term.isEmpty()) {
                filteredCourses = courses.stream()
                        .filter(course -> course.getName().toLowerCase().contains(term.toLowerCase()) ||
                               course.getDescription().toLowerCase().contains(term.toLowerCase()))
                        .collect(Collectors.toCollection(ArrayList::new));
            } else {
                filteredCourses = new ArrayList<>(courses);
            }
            var header = "Programming courses";
            var page = new CoursesPage(filteredCourses, term, header);
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
