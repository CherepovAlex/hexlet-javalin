package org.example15.dto.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example15.model.User;

import java.util.List;

@AllArgsConstructor
@Getter
public class UsersPage {
    private List<User> users;

}
