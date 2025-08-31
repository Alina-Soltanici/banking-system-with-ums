package com.sistem_bank.fibank.config;

import com.sistem_bank.fibank.model.Role;
import com.sistem_bank.fibank.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        if(roleRepository.findByName ("USER").isEmpty ()) {
            roleRepository.save (new Role (null, "USER"));
        }

        if(roleRepository.findByName ("ADMIN").isEmpty ()) {
            roleRepository.save (new Role (null, "ADMIN"));
        }
    }
}
