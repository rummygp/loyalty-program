package com.rummygp.loyalty_program.model;

import com.rummygp.loyalty_program.enums.TransactionType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class PointsTransaction {
    private final UUID id;
    private final TransactionType type;
    private final String description;
    private final int points;
    private final LocalDateTime transactionTime;

    public PointsTransaction(TransactionType type, String description, int points) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.description = description;
        this.points = points;
        this.transactionTime = LocalDateTime.now();
    }
}
