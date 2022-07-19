package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.OTP;

public interface OtpRepository extends JpaRepository<OTP, Long>{

	void save(String otp);

}
