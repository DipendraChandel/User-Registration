package com.registration.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.entity.RegistrationEntity;

@Repository
public interface registrationRepository extends JpaRepository<RegistrationEntity, Integer>{

}
