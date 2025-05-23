package org.example9.dto.courses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example9.model.Course;

import java.util.List;

@AllArgsConstructor
@Getter
public class CoursesPage {
    private List<Course> courses;
    private String term;
    private String header;
}