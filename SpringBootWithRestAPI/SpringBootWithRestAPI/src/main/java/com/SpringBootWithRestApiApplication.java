package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRestApiApplication.class, args);
		System.out.println("Server upp!");
	}

}
