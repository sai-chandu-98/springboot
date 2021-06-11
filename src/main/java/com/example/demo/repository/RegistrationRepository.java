package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

	Registration deleteById(int i);

}
