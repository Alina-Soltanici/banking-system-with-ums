package com.sistem_bank.fibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()

public class FibankApplication {
	public static void main(String[] args) {
		SpringApplication.run(FibankApplication.class, args);
	}
}
