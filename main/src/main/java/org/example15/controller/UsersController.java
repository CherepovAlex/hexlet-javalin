package org.example15.controller;

import io.javalin.http.Context;
import io.javalin.validation.ValidationException;

import org.example15.NamedRoutes;
import org.example15.dto.users.BuildUserPage;
import org.example15.dto.users.UserPage;
import org.example15.dto.users.UsersPage;
import org.example15.model.User;
import org.example15.repository.UserRepository;

import static io.javalin.rendering.template.TemplateUtil.model;

public class UsersController {

    // Отображение списка пользователей
    public static void index(Context ctx) {
        var users = UserRepository.getEntities();
        var page = new UsersPage(users);
        ctx.render("example15/users/index.jte", model("page", page));
    }
    // Просмотр конкретного пользователя
    public static void show(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var user = UserRepository.find(id);
        var page = new UserPage(user);
        ctx.render("example15/users/show.jte", model("page", page));
    }
    // Форма создания нового пользователя
    public static void build(Context ctx) {
        var page = new BuildUserPage();
        ctx.render("example15/users/build.jte", model("page", page));
    }
    // Создание пользователя (обработка формы)
    public static void create(Context ctx) {
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
            ctx.render("example15/users/build.jte", model("page", page));
        }
    }
    // Форма редактирования пользователя
    public static void edit(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var user = UserRepository.find(id);
        var page = new UserPage(user);
        ctx.render("example15/users/edit.jte", model("page", page));
    }
    // Обновление данных пользователя
    public static void update(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var user = UserRepository.find(id);

        user.setName(ctx.formParam("name"));
        user.setEmail(ctx.formParam("email"));
        user.setPassword(ctx.formParam("password"));

        UserRepository.save(user);
        ctx.redirect(NamedRoutes.usersPath());
    }
    // Удаление пользователя из репозитория
    public static void destroy(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        UserRepository.delete(id);
        ctx.redirect(NamedRoutes.usersPath());
    }
    // Маршрут на главную страницу
    public static void home(Context ctx) {
        ctx.render("example15/index.jte");
    }
}
