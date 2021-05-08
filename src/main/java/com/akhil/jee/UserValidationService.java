package com.akhil.jee;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class UserValidationService {
	
	private static HashMap<String, String> credentials = new HashMap<String, String>();
	
	static {
		credentials.put("Anvesh", "password"); 
	}
	
	public static HashMap<String, String> getCredentials(){
		return credentials;
	}

	public boolean isUserValid(String name, String password) {
		if(!credentials.containsKey(name)) {
			return false;
		}
		String passcode = credentials.get(name);
		return passcode.equals(password);
	}
	
	public static void register(String name, String password) {
		credentials.put(name, password);
	}
	
}
