package com.rummygp.loyalty_program.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoyaltyProgram {
    private Long id;
    private String name;
    private String description;
    private LocalDate validationTime;
    private boolean status;
}
