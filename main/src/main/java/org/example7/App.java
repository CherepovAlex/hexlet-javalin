//package org.example7;
//
//import io.javalin.Javalin;
//import java.util.List;
//import io.javalin.http.NotFoundResponse;
//import org.example7.model.User;
//import org.example7.dto.users.UserPage;
//import org.example7.dto.users.UsersPage;
//import static io.javalin.rendering.template.TemplateUtil.model;
//import io.javalin.rendering.template.JavalinJte;
//
//public final class App {
//
//    // Каждый пользователь представлен объектом класса User
//    private static final List<User> USERS = Data.getUsers();
//
//    public static Javalin getApp() {
//
//        var app = Javalin.create(config -> {
//            config.bundledPlugins.enableDevLogging();
//            config.fileRenderer(new JavalinJte());
//        });
//
//        app.get("/users", ctx ->{
//            var users = Data.getUsers();
//            var header = "All users";
//            var page = new UsersPage(USERS, header);
//            ctx.render("users/index.jte", model("page", page));
//        });
//
//        app.get("/", ctx -> ctx.render("index7.jte"));
//
//        return app;
//    }
//
//    public static void main(String[] args) {
//        Javalin app = getApp();
//        app.start(7070);
//    }
//}
