package org.example16.dto.courses;

import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BuildCoursePage {
    private String name;
    private String description;
    private Map<String, List<ValidationError<Object>>> errors;
}