package com.example.ManagerMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class ManagerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerMicroServiceApplication.class, args);
	System.out.println("Manager server upp!!!");	
	}

}
