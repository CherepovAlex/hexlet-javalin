package org.example14.repository;

import io.javalin.http.NotFoundResponse;
import org.example14.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private static List<User> entities = new ArrayList<User>();

    public static void save(User user) {
        user.setId((long) entities.size() + 1);
        user.setCreatedAt(LocalDateTime.now());
        entities.add(user);
    }

    public static List<User> search(String term) {
        var users = entities.stream()
                .filter(user -> user.getName().startsWith(term))
                .toList();
        return users;
    }

    public static User find(Long id) {
        return entities.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new NotFoundResponse("Пользователь не найден"));
    }

    public static void delete(Long id) {
        entities.removeIf(user -> user.getId() == id);
    }

    public static void removeAll() {
        entities = new ArrayList<User>();
    }

    public static List<User> getEntities() {
        return entities != null ? new ArrayList<>(entities) : Collections.emptyList();
    }
}
