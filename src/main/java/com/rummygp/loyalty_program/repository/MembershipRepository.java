package com.rummygp.loyalty_program.repository;

import com.rummygp.loyalty_program.model.Membership;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class MembershipRepository {
    private List<Membership> memberships = new ArrayList<>();

    public List<Membership> findAll() {
        return new ArrayList<>(memberships);
    }

    public Optional<Membership> findById(UUID id) {
        return memberships.stream()
                .filter(membership -> membership.getId().equals(id))
                .findFirst();
    }

    public Membership add(Membership membership) {
        memberships.add(membership);
        return membership;
    }

    public boolean remove(UUID id) {
        return memberships.removeIf(membership -> membership.getId().equals(id));
    }
}
