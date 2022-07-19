package com.example.project.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
	



	



	Page<Product> findById(Long id, Pageable pageable);

	Product getById(Product product);
	


	//List<Product> findAllByIsActive(String status);

	List<Product> findAll();

	


}
