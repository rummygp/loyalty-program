package com.rummygp.loyalty_program.dto;

import com.rummygp.loyalty_program.model.LoyaltyProgram;

import java.time.LocalDateTime;

public record UserDto(String name, String lastName, String email, LocalDateTime createdAt, LoyaltyProgram loyaltyProgram) {
}
