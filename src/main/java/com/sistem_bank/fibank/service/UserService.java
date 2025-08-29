package com.sistem_bank.fibank.service;


import com.sistem_bank.fibank.dto.LoginRequest;
import com.sistem_bank.fibank.dto.LoginResponse;
import com.sistem_bank.fibank.dto.SignupRequest;
import com.sistem_bank.fibank.dto.SignupResponse;

public interface UserService {
    SignupResponse signUp(SignupRequest signupRequest);
    LoginResponse login(LoginRequest loginRequest);
}
