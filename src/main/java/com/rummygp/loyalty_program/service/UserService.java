package com.rummygp.loyalty_program.service;

import com.rummygp.loyalty_program.exception.UserNotFoundException;
import com.rummygp.loyalty_program.model.User;
import com.rummygp.loyalty_program.repository.UserRepository;
import com.rummygp.loyalty_program.validator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getUser(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UserNotFoundException(email));
    }

    public User addUser (User user) {
        UserValidator.validateUserCreate(user, userRepository);
        return userRepository.add(user);
    }
}
