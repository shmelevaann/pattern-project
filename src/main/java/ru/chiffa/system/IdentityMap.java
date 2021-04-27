package ru.chiffa.system;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

@Component
public class IdentityMap {
    private HashMap<UUID, User> userMap = new HashMap<>();

    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    public User getUser(UUID id) {
        return userMap.get(id);
    }

    public boolean containsId(UUID id) {
        return userMap.containsKey(id);
    }
}
