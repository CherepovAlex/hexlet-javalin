package org.example3;

import io.javalin.Javalin;

public class dynamic_routes {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу
        app.get("/users/{id}/post/{postId}", ctx -> {
            var id = ctx.pathParam("id");
            var postId = ctx.pathParam("postId");
            ctx.result("User ID: " + id + " Post ID: " + postId);
        });
        app.start(7070); // Стартуем веб-сервер
    }
}
