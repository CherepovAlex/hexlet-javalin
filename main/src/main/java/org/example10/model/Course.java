package org.example10.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public final class Course {
    private Long id;
    @ToString.Include
    private String name;
    private String description;
    private LocalDateTime createdAt;

    public Course(Long id, String name, String description) {
        this.name = name;
        this.description = description;
    }
}
