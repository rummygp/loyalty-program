package com.rummygp.loyalty_program.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Period {
    private LocalDate startDate;
    private LocalDate endDate;
}
