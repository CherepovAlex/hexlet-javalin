package org.example14.dto.users;

import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BuildUserPage {
    private String name;
    private String email;
    private Map<String, List<ValidationError<Object>>> errors;
}