package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class ManagerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerMicroserviceApplication.class, args);
		System.out.println("");
	}

}
