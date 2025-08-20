package com.rummygp.loyalty_program.repository;

import com.rummygp.loyalty_program.model.EarningRule;
import com.rummygp.loyalty_program.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EarningRuleRepository {
    private List<EarningRule> earningRules = new ArrayList<>();

    public List<EarningRule> findAll() {
        return new ArrayList<>(earningRules);
    }

    public Optional<EarningRule> findById(UUID id) {
        return earningRules.stream()
                .filter(rule -> rule.getId().equals(id))
                .findFirst();
    }

    public EarningRule add(EarningRule earningRule) {
        earningRules.add(earningRule);
        return earningRule;
    }

    public boolean remove(UUID id) {
        return earningRules.removeIf(rule -> rule.getId().equals(id));
    }
}
