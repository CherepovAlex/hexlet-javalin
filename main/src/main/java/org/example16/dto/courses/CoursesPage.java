package org.example16.dto.courses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example16.model.Course;

import java.util.List;

@AllArgsConstructor
@Getter
public class CoursesPage {
    private List<Course> courses;
}