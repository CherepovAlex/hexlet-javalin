package org.example13.repository;

import org.example13.model.Course;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseRepository {
    private static List<Course> entities = new ArrayList<Course>();

    public static void save(Course course) {
        course.setId((long) entities.size() + 1);
        course.setCreatedAt(LocalDateTime.now());
        entities.add(course);
    }

    public static List<Course> search(String term) {
        var courses = entities.stream()
                .filter(course -> course.getName().startsWith(term))
                .toList();
        return courses;
    }

    public static Optional<Course> find(Long id) {
        var maybeCourse = entities.stream()
                .filter(course -> course.getId() == id)
                .findAny();
        return maybeCourse;
    }

    public static boolean existsByTitle(String name) {
        return entities.stream()
                .anyMatch(value -> value.getName().equals(name));
    }

    public static List<Course> findAll() {
        return entities;
    }

    public static void delete(Long id) {
        entities.removeIf(course -> course.getId() == id);
    }

    public static void removeAll() {
        entities = new ArrayList<Course>();
    }

    public static List<Course> getEntities() {
        return entities;
    }
}
