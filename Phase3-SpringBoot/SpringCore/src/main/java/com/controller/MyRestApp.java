package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Feedback;
import com.service.AppService;

@RestController
//@RequestMapping(value = "/feedback1", method = RequestMethod.POST)
public class MyRestApp {

	@Autowired
	private AppService service;

	@PostMapping("/feedback1")
	public String userRegister(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("email") String email , @RequestParam("feedback1") String feedback1) {
	Feedback f = new Feedback(firstname, lastname, email,feedback1);
	boolean data= service.addFeedback(f);
	if(data) {
		return "Feedback added succesfully!";
	}
	else {
		return "Unable to add the feedback";
	}
		
	}
}