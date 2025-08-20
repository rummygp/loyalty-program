package com.rummygp.loyalty_program.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor //na pierwsze 3 programy
public class LoyaltyProgram {
    private UUID id;
    private String name;
    private String description;
    private Period period;
    private List<EarningRule> earningRules;
    private List<Reward> rewards;
    private List<Campaign> campaigns;

    public LoyaltyProgram(String name, String description, Period period, List<EarningRule> earningRules, List<Reward> rewards, List<Campaign> campaigns) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.period = period;
        this.earningRules = earningRules;
        this.rewards = rewards;
        this.campaigns = campaigns;
    }
}
