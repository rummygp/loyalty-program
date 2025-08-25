package com.rummygp.loyalty_program.service;

import com.rummygp.loyalty_program.exception.UserNotFoundException;
import com.rummygp.loyalty_program.model.User;
import com.rummygp.loyalty_program.repository.UserRepository;
import com.rummygp.loyalty_program.validator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUser(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    public User addUser (User user) {
        UserValidator.validateUserCreate(user, userRepository);
        return userRepository.add(user);
    }
}
