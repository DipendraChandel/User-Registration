package com.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.entity.RegistrationEntity;
import com.registration.service.registrationService;

@RestController
@CrossOrigin
public class registrationController {

	@Autowired
	private registrationService service;
	
	
	@PostMapping("/register")
	public RegistrationEntity registerUser(@RequestBody RegistrationEntity entity) {
		return service.registerUser(entity);
	}
	
	
	@GetMapping("/users")
	public List<RegistrationEntity> allUsers(){
		return service.getAllUser();
	}
}
