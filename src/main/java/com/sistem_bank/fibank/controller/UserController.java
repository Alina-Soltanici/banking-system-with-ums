package com.sistem_bank.fibank.controller;

import com.sistem_bank.fibank.dto.SignupRequest;
import com.sistem_bank.fibank.dto.SignupResponse;
import com.sistem_bank.fibank.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<SignupResponse> signup(@RequestBody SignupRequest signupRequest) {
        return new ResponseEntity<> (userService.signUp (signupRequest), HttpStatus.CREATED);
    }

//    @PostMapping
//    public ResponseEntity
}
