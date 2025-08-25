package com.rummygp.loyalty_program.exception;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class UserNotFoundException extends LoyaltyProgramException {
    public UserNotFoundException(UUID id) {
        super("User with id: " + id + " does not exist", HttpStatus.NOT_FOUND);
    }
}
