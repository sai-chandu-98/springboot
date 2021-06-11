package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Registration;
import com.example.demo.service.RegistrationService;

@RestController
//@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;

	@PostMapping(value="saveRegistrationDetails")
	public Registration saveRegistrationDetails(Registration registration)
	{
		return registrationService.saveRegistrationDetails(registration);
	}
	
	@PostMapping(value="deleteRegistrationDetails")
	public Registration deleteRegistrationDetails(Registration id)
	{
		return registrationService.deleteRegistrationDetails(4);
		
	}
	
	@GetMapping(value = "/test")
	public String test() {
		return "Application started";
	}

}
