package com.rummygp.loyalty_program.dto;

import java.time.LocalDateTime;

public record UserDto(String firstName, String lastName, String email, LocalDateTime createdAt) {
}
