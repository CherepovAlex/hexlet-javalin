package org.example8;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;

import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import gg.jte.ContentType;

import java.nio.file.Paths;

import org.apache.commons.text.StringEscapeUtils;

public class App {
    public static void main(String[] args) {
        var templateEngine = TemplateEngine.create(
                new DirectoryCodeResolver(Paths.get("src/main/jte/example8")),
                ContentType.Html
        );
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte(templateEngine));
        });
        // Принимает на вход HTML и заменяет в нем все спецсимволы на их HTML-эквиваленты.
        // Остальные символы остаются без изменений.
        app.get("/users/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var escapeId = StringEscapeUtils.escapeHtml4(id);
            ctx.contentType("text/html");
            ctx.result("<h1>" + escapeId + "</h1");
        });
        app.start(7070);
    }
}
