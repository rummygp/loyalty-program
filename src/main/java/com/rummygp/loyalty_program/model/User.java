package com.rummygp.loyalty_program.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime createdAt;
    private LoyaltyProgram loyaltyProgram;

    public User(String name, String lastName, String email, LoyaltyProgram loyaltyProgram) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.loyaltyProgram = loyaltyProgram;
    }
}
