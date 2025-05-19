package org.example15;

public class NamedRoutes {

    public static String homePath() {return "/";}

    public static String usersPath() { return "/users"; }
    public static String buildUsersPath() { return "/users/build"; }

    public static String userPath(Long id) { return userPath(String.valueOf(id)); }
    public static String userPath(String id) { return "/users/" + id; }

    public static String editUserPath(Long id) { return editUserPath(String.valueOf(id)); }
    public static String editUserPath(String id) { return "/users/" + id + "/edit"; }

    public static String updateUserPath(Long id) {return updateUserPath(String.valueOf(id));}
    public static String updateUserPath(String id) { return "/users/" + id + "/update"; }

    public static String deleteUserPath(Long id) {return deleteUserPath(String.valueOf(id));}
    public static String deleteUserPath(String id) { return "/users/" + id + "/delete"; }
}
