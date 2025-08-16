package com.rummygp.loyalty_program.validator;

import com.rummygp.loyalty_program.exception.EmailAlreadyExistsException;
import com.rummygp.loyalty_program.model.User;
import com.rummygp.loyalty_program.repository.UserRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserValidator {
    public static void validateUserCreate(User user, UserRepository userRepository) {
        if (user.getId() == null ||
                user.getName() == null ||
                user.getLastName() == null ||
                user.getEmail() == null ||
                user.getLoyaltyProgram() == null ||
                user.getCreatedAt() == null) {
            throw new IllegalArgumentException("Fields should not be null");
        }
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new EmailAlreadyExistsException(user.getEmail());
        }
    }
}
