package com.example.project.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Product;

@Repository
public interface ProductsPaggingRepository extends PagingAndSortingRepository<Product, Long> {
	
	

}
