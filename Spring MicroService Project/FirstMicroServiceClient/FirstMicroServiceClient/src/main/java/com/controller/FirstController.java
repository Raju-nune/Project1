package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
@RequestMapping(value="First Client")
	public String sayHello()
	{
		return "Welccome to SpringBoot with First Application";
	}
}
