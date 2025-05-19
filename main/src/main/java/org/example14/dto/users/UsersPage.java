package org.example14.dto.users;

import org.example14.model.User;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsersPage {
    private List<User> users;

}
