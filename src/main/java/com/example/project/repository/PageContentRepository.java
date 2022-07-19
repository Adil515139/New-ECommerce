package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Page_content;

public interface PageContentRepository extends JpaRepository<Page_content, Long> {

	Page_content findByType(String type);

	
	
}
