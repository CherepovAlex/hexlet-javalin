package org.example12.dto.users;

import io.javalin.validation.ValidationError;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BuildUserPage {
    private String name;
    private String email;
    private Map<String, List<ValidationError<Object>>> errors;
}