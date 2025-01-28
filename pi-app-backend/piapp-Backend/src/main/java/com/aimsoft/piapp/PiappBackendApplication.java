package com.aimsoft.piapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= SecurityAutoConfiguration.class)
public class PiappBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiappBackendApplication.class, args);
	}

}
