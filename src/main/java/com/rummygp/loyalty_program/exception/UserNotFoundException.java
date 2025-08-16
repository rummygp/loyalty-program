package com.rummygp.loyalty_program.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends LoyaltyProgramException {
    public UserNotFoundException(String email) {
        super("User with email: " + email + " does not exist", HttpStatus.NOT_FOUND);
    }
}
