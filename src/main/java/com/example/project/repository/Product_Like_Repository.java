package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Product_liked;

@Repository
public interface Product_Like_Repository extends JpaRepository<Product_liked, Long>{


	List<Product_liked> findAll();


	
}
