package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.service.LoginService;

@RestController
public class LoginController {
	
	
	  @Autowired private LoginService ls;
	  
	  @RequestMapping(path="/login", method = RequestMethod.POST)
	  public String onRecieve(@RequestParam("email") String email,@RequestParam("password") String password) { 
		  boolean isValid=ls.validateUser(email, password);
	  if(isValid==(true))
	  { return "index.html"; 
	  }
	  return "login.html"; 
	  }
	 
}
