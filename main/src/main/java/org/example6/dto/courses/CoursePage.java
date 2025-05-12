package org.example6.dto.courses;
// Путь src/org/example/hexlet/dto/courses/CoursePage.java
import org.example6.model.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CoursePage {
    private Course course;
}
