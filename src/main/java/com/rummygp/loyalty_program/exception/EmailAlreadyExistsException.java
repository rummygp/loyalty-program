package com.rummygp.loyalty_program.exception;

import org.springframework.http.HttpStatus;

public class EmailAlreadyExistsException extends LoyaltyProgramException{
    public EmailAlreadyExistsException(String email) {
        super("User with email: " + email + " already exists", HttpStatus.CONFLICT);
    }
}
