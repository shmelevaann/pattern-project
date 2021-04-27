package ru.chiffa.system;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final IdentityMap userMap;
    private HashMap<UUID, String> mockDB = new HashMap<>();

    public User findById(UUID id) {
        return userMap.containsId(id) ? userMap.getUser(id) : findByIdInDB(id);
    }

    private User findByIdInDB(UUID id) {
        return userMapper.mapUser(id, mockDB.get(id));
    }
}
