package org.example10.repository;

import org.example10.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
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

    public static Optional<User> find(Long id) {
        var maybeUser = entities.stream()
                .filter(user -> user.getId() == id)
                .findAny();
        return maybeUser;
    }

    public static void delete(Long id) {
        entities.removeIf(user -> user.getId() == id);
    }

    public static void removeAll() {
        entities = new ArrayList<User>();
    }

    public static List<User> getEntities() {
        return entities;
    }
}
