package com.service;

public class EmployeeService {
	public String checkuser(String emailid, String password) {
		if(emailid.equals("raju@gmail.com")&& password.contentEquals("777")) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}