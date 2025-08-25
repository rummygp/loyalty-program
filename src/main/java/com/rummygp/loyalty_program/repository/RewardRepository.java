package com.rummygp.loyalty_program.repository;

import com.rummygp.loyalty_program.model.Reward;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RewardRepository {
    private List<Reward> rewards = new ArrayList<>();

    public List<Reward> findAll() {
        return new ArrayList<>(rewards);
    }

    public Optional<Reward> findById(UUID id) {
        return rewards.stream()
                .filter(reward -> reward.getId().equals(id))
                .findFirst();
    }

    public Reward add(Reward reward) {
        rewards.add(reward);
        return reward;
    }

    public boolean remove(UUID id) {
        return rewards.removeIf(reward -> reward.getId().equals(id));
    }
}
