package com.rummygp.loyalty_program.model;

import com.rummygp.loyalty_program.enums.EventType;
import lombok.Data;

import java.util.UUID;

@Data
public class Campaign {
    private UUID id;
    private String name;
    private String description;
    private Period period;
    private float multiplier = 1.0F;
    private int extraPoints = 0;
    private EventType targetEventType;

    public Campaign(UUID id, String name, String description, Period period, int extraPoints, EventType targetEventType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.period = period;
        this.extraPoints = extraPoints;
        this.targetEventType = targetEventType;
    }

    public Campaign(UUID id, String name, String description, Period period, float multiplier, EventType targetEventType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.period = period;
        this.multiplier = multiplier;
        this.targetEventType = targetEventType;
    }
}
