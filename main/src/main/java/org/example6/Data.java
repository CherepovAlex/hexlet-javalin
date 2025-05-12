package org.example6;

import org.example6.model.Course;
import java.util.List;
import java.util.ArrayList;

public class Data {
    private static List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course(1L, "Java Basics", "Learn core Java concepts"));
        courses.add(new Course(2L, "Web Development", "Build web applications"));
        courses.add(new Course(3L, "Database Fundamentals", "Learn SQL and database design"));
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public static Course getCourseById(Long id) {
        if (id == null) return null;
        return courses.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}