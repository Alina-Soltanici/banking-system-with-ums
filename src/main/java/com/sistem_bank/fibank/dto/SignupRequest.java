package com.sistem_bank.fibank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class SignupRequest {
    private String username;
    private String password;
    private String email;
}
