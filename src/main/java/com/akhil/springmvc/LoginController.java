package com.akhil.springmvc;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.akhil.jee.UserValidationService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	UserValidationService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistrationPage() {
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String showLoginAfterRegistration(@RequestParam String name, @RequestParam String password) {
		UserValidationService.register(name, password);
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String HandleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(!service.isUserValid(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		return "welcome";
	}
	
	
	
	
}