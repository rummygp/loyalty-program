package com.rummygp.loyalty_program.repository;

import com.rummygp.loyalty_program.model.PointsTransaction;
import com.rummygp.loyalty_program.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PointsTransactionRepository {
    private List<PointsTransaction> pointsTransactions = new ArrayList<>();

    public List<PointsTransaction> findAll() {
        return new ArrayList<>(pointsTransactions);
    }

    public Optional<PointsTransaction> findById(UUID id) {
        return pointsTransactions.stream()
                .filter(transaction -> transaction.getId().equals(id))
                .findFirst();
    }

    public PointsTransaction add(PointsTransaction pointsTransaction) {
        pointsTransactions.add(pointsTransaction);
        return pointsTransaction;
    }

    public boolean remove(UUID id) {
        return pointsTransactions.removeIf(transaction -> transaction.getId().equals(id));
    }
}
