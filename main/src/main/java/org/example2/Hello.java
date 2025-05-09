package org.example2;

import io.javalin.Javalin;

public class Hello {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
        app.get("/hello", ctx -> {
            String name = ctx.queryParam("name");
            if (name == null || name.isEmpty()){
                name = "World";
            }
            ctx.result("Hello, " + name + "!");
        });
        app.start(7070); // Стартуем веб-сервер
    }
}