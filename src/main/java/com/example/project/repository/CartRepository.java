package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.model.Cart;
import com.example.project.model.Product;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

	
	  @Query(value = "SELECT product_id from cart  c where c.product_id=:product_id",
	  nativeQuery = true) Cart findByProduct(Product product_id);
	 



}
