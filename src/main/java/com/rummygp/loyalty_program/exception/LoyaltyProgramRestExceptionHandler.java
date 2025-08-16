package com.rummygp.loyalty_program.exception;

import com.rummygp.loyalty_program.dto.ErrorMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class LoyaltyProgramRestExceptionHandler {

    @ExceptionHandler(value = LoyaltyProgramException.class)
    protected ResponseEntity<ErrorMessageDto> handleLoyaltyProgramException(LoyaltyProgramException ex) {
        return ResponseEntity.status(ex.getHttpStatus()).body(ErrorMessageDto.builder()
                .createdAt(LocalDateTime.now())
                .message(ex.getMessage())
                .status(ex.getHttpStatus().value())
                .error(ex.getHttpStatus().getReasonPhrase())
                .build());
    }
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    protected ErrorMessageDto handleGlobalException (Exception ex) {
       return ErrorMessageDto.builder()
               .createdAt(LocalDateTime.now())
               .message(ex.getMessage())
               .error("Unknown Error")
               .status(500)
               .build();
    }
}
