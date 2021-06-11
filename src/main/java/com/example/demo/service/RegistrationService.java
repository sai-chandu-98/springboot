package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Registration;
import com.example.demo.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;

	
	public Registration saveRegistrationDetails(Registration registration)
	{
		return registrationRepository.save(registration);
	}
	
	public Registration deleteRegistrationDetails(int i)
	{
		return registrationRepository.deleteById(5);
	}
}
