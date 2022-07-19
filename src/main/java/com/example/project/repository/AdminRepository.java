package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin  findByEmail(String email);
	
}
