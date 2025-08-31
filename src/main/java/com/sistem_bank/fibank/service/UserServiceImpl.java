package com.sistem_bank.fibank.service;

import com.sistem_bank.fibank.dto.LoginRequest;
import com.sistem_bank.fibank.dto.LoginResponse;
import com.sistem_bank.fibank.dto.SignupRequest;
import com.sistem_bank.fibank.dto.SignupResponse;
import com.sistem_bank.fibank.exceptions.RoleNotFoundException;
import com.sistem_bank.fibank.mapper.UserMapper;
import com.sistem_bank.fibank.model.Role;
import com.sistem_bank.fibank.model.User;
import com.sistem_bank.fibank.repository.RoleRepository;
import com.sistem_bank.fibank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;


    @Override
    public SignupResponse signUp(SignupRequest signupRequest) {
        User user = userMapper.toEntity (signupRequest);
        user.setPassword (passwordEncoder.encode (signupRequest.getPassword ()));

       Role defaultRole = roleRepository.findByName ("USER")
               .orElseThrow (() -> new RoleNotFoundException ("Role not found"));
        user.setRoles (Set.of (defaultRole));
        User savedUser = userRepository.save (user);
        return userMapper.toSignupResponse (savedUser);
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }
}
