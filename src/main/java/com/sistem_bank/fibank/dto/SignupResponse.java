package com.sistem_bank.fibank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignupResponse {
    private Long id;
    private String username;
    private String email;
    private String message;
}
