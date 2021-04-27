package ru.chiffa.system;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserMapper {
    public User mapUser(UUID id, String name) {
        return new User(id, name);
    }
}
