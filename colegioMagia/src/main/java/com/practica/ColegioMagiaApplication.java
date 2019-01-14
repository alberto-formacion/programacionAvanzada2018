package com.practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.practica"})
public class ColegioMagiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColegioMagiaApplication.class, args);
	}

}

