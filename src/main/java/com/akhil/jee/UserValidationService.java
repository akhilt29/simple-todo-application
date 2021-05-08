package com.akhil.jee;

import org.springframework.stereotype.Component;

@Component
public class UserValidationService {

	public boolean isUserValid(String name, String password) {
		if((name.equals("Anvesh") && (password.equals("")))) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
