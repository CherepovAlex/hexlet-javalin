package org.example16.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
public final class Course {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
    }
}