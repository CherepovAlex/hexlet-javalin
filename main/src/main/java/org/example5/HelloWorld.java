package org.example5;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            // укажем, что мы хотим использовать jte в качестве шаблонизатора в нашем приложении
            config.fileRenderer(new JavalinJte());
        });
        // Укажем обработчику главной страницы использовать этот шаблон: src/main/jte
        // render выполняет рендеринг указанного шаблона и добавляет результат в HTTP-ответ
        app.get("/", ctx -> ctx.render("index.jte"));
        app.exception(Exception.class, (e, ctx) -> {
            e.printStackTrace(); // Выведет полный стек ошибки в консоль
            ctx.status(500).result("Error: " + e.getMessage());
        });
        app.start(7070); // Стартуем веб-сервер
    }
}
