package com.rummygp.loyalty_program.repository;

import com.rummygp.loyalty_program.model.LoyaltyProgram;
import com.rummygp.loyalty_program.model.LoyaltyProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class LoyaltyProgramRepository {
    private List<LoyaltyProgram> loyaltyPrograms = new ArrayList<>();

    public List<LoyaltyProgram> findAll() {
        return new ArrayList<>(loyaltyPrograms);
    }

    public Optional<LoyaltyProgram> findById(UUID id) {
        return loyaltyPrograms.stream()
                .filter(program -> program.getId().equals(id))
                .findFirst();
    }

    public LoyaltyProgram add(LoyaltyProgram loyaltyProgram) {
        loyaltyPrograms.add(loyaltyProgram);
        return loyaltyProgram;
    }

    public boolean remove(UUID id) {
        return loyaltyPrograms.removeIf(program -> program.getId().equals(id));
    }
}
