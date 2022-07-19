package com.example.project.service;

import java.util.List;

import com.example.project.model.Product_liked;

public interface ProductLikeService {
	
	int totalLikeProduct();

	List<Product_liked> getAllProductLiked();

}
