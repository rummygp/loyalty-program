package com.rummygp.loyalty_program.command;

import com.rummygp.loyalty_program.model.LoyaltyProgram;

public record UserCreateCommand(String name, String lastName, String email, LoyaltyProgram loyaltyProgram) {
}
