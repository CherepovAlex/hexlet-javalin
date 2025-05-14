package org.example9.model;
// Путь src/org/example/hexlet/model/Course.java

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class Course {
    private Long id;
    @ToString.Include
    private String name;
    private String description;

    public Course(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
