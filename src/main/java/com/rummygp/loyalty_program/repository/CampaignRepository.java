package com.rummygp.loyalty_program.repository;

import com.rummygp.loyalty_program.model.Campaign;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CampaignRepository {
    private List<Campaign> campaigns = new ArrayList<>();

    public List<Campaign> findAll() {
        return new ArrayList<>(campaigns);
    }

    public Optional<Campaign> findById(UUID id) {
        return campaigns.stream()
                .filter(campaign -> campaign.getId().equals(id))
                .findFirst();
    }

    public Campaign add(Campaign campaign) {
        campaigns.add(campaign);
        return campaign;
    }

    public boolean remove(UUID id) {
        return campaigns.removeIf(campaign -> campaign.getId().equals(id));
    }
}
