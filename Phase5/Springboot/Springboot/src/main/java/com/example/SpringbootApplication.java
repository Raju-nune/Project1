package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {
	
	@GetMapping("/")
	public String home() {
		return "welocome to the deployment of springboot application in aws";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
