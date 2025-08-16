package com.rummygp.loyalty_program.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorMessageDto {
    private LocalDateTime createdAt;
    private String message;
    private int status;
    private String error;
}
