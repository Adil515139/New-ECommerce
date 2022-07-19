package com.example.project.service;

import java.util.List;

import com.example.project.model.Cart;

public interface CartService {
	 public List<Cart> getAllCart(int pageNo, int pageSize, String sortBy);

	public Cart findById(Long id);

	public List<Cart> getAllCarts();

	//List<Cart> findByProduct(Product product);

}
