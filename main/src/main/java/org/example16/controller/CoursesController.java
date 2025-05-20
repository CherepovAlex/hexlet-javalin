package org.example16.controller;

import io.javalin.http.Context;
import io.javalin.validation.ValidationException;

import org.example16.NamedRoutes;
import org.example16.dto.courses.BuildCoursePage;
import org.example16.dto.courses.CoursePage;
import org.example16.dto.courses.CoursesPage;
import org.example16.model.Course;
import org.example16.repository.CourseRepository;

import static io.javalin.rendering.template.TemplateUtil.model;

public class CoursesController {

    // Отображение списка курсов
    public static void index(Context ctx) {
        var courses = CourseRepository.getEntities();
        var page = new CoursesPage(courses);
        ctx.render("example16/courses/index.jte", model("page", page));
    }
    // Просмотр конкретного курса
    public static void show(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var course = CourseRepository.find(id);
        var page = new CoursePage(course);
        ctx.render("example16/courses/show.jte", model("page", page));
    }
    // Форма создания нового курса
    public static void build(Context ctx) {
        var page = new BuildCoursePage();
        ctx.render("example16/courses/build.jte", model("page", page));
    }
    // Создание курса (обработка формы)
    public static void create(Context ctx) {
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
                ctx.redirect(NamedRoutes.coursesPath());
            } catch (ValidationException e) {
                var page = new BuildCoursePage(name, description, e.getErrors());
                ctx.render("example16/courses/build.jte", model("page", page));
            }
    }
    // Форма редактирования курса
    public static void edit(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var course = CourseRepository.find(id);
        var page = new CoursePage(course);
        ctx.render("example16/courses/edit.jte", model("page", page));
    }
    // Обновление данных курса
    public static void update(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var course = CourseRepository.find(id);

        course.setName(ctx.formParam("name"));
        course.setDescription(ctx.formParam("description"));

        CourseRepository.save(course);
        ctx.redirect(NamedRoutes.coursesPath());
    }
    // Удаление пользователя из репозитория
    public static void destroy(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        CourseRepository.delete(id);
        ctx.redirect(NamedRoutes.coursesPath());
    }
    // Маршрут на главную страницу
    public static void home(Context ctx) {
        ctx.render("example16/index.jte");
    }
}
