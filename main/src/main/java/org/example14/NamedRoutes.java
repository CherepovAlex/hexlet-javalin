package org.example14;

public class NamedRoutes {

    // На главную страницу
    public static String homePath() {return "/";}
    // Маршрут добавления нового пользователя
    public static String buildUsersPath() {
        return "/users/build";
    }
    public static String usersPath() {
        return "/users";
    }
    // Маршруты на страницу пользователя
    public static String usersPath(Long id) {return usersPath(String.valueOf(id));}
    public static String usersPath(String id) {return "/users/" + id;}
    // Маршруты на редактирование пользователей
    public static String editUserPath(Long id) { return editUserPath(String.valueOf(id)); }
    public static String editUserPath(String id) { return "/users/" + id + "/edit"; }
    // Маршруты на всех пользователей
    public static String fullUsersPath() {return "http://localhost:7070" + usersPath();}
    public static String fullBuildUsersPath() {return "http://localhost:7070" + buildUsersPath();}
}
