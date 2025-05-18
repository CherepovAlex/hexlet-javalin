package org.example13;

public class NamedRoutes {

    // Маршрут курcов
    public static String coursesPath() {
        return "/courses";
    }
    public static String buildCoursesPath() {
        return "/courses/build";
    }
    public static String coursePath(Long id) {return coursePath(String.valueOf(id));}
    public static String coursePath(String id) {return "/courses/" + id;}
}
