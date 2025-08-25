package com.rummygp.loyalty_program.repository;

import com.rummygp.loyalty_program.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    public Optional<User> findById(UUID id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public User add(User user) {
        users.add(user);
        return user;
    }

    public boolean remove(UUID id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
