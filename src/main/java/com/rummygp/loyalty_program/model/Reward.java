package com.rummygp.loyalty_program.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Reward {
    private UUID id;
    private String name;
    private String description;
    private int pointsCost;
    private Period period;

    public Reward(String name, String description, int pointsCost, Period period) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.pointsCost = pointsCost;
        this.period = period;
    }
}
