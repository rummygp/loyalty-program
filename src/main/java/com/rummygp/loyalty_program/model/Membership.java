package com.rummygp.loyalty_program.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
public class Membership {
    private UUID id;
    private User user;
    private LoyaltyProgram program;
    private LocalDate joinDate;
    private int pointsBalance;
    private List<PointsTransaction> pointsTransactions;

    public Membership(User user, LoyaltyProgram program, int pointsBalance, List<PointsTransaction> pointsTransactions) {
        this.id = UUID.randomUUID();
        this.user = user;
        this.program = program;
        this.joinDate = LocalDate.now();
        this.pointsBalance = pointsBalance;
        this.pointsTransactions = pointsTransactions;
    }
}
