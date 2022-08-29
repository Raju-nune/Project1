package com.user;

public class UserAuthenticate {
	public String checkuser(String emailid, String password) {
		if(emailid.equals("raju@gmail.com")&& password.contentEquals("777")) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}
