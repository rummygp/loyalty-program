package com.rummygp.loyalty_program.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LoyaltyProgramException extends RuntimeException{
    private final HttpStatus httpStatus;

    public LoyaltyProgramException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
