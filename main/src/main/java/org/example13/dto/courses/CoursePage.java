package org.example13.dto.courses;

import java.util.List;
import org.example13.model.Course;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class CoursePage {
    private List<Course> courses;
}
