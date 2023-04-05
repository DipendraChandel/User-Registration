package com.registration.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.entity.RegistrationEntity;
import com.registration.repository.registrationRepository;

@Service
public class registrationService {
	
	@Autowired
	private registrationRepository repository;

	public RegistrationEntity registerUser(RegistrationEntity entity) {
		return repository.save(entity);
	}
	
	public List<RegistrationEntity> getAllUser(){
		return repository.findAll();
	}
}
