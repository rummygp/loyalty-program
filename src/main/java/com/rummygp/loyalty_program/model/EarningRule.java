package com.rummygp.loyalty_program.model;

import com.rummygp.loyalty_program.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class EarningRule {
    private UUID id;
    private String name;
    private EventType eventType;
    private int pointsNumber;
    private Period period;

    public EarningRule(String name, EventType eventType, int pointsNumber, Period period) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.eventType = eventType;
        this.pointsNumber = pointsNumber;
        this.period = period;
    }
}
