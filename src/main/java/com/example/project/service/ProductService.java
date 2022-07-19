package com.example.project.service;

import java.util.List;

import com.example.project.model.Product;

public interface ProductService {
	 public List<Product> getAllProducts(int pageNo, int pageSize, String sortBy);
	 
	  int totalProductAvailable();

	public void addProduct(Product product);

	//public List<Product> getAllProductById();

	//List<Product> getAllProductById(Long id);

	//public List<Product> getAllProductById(Product product);

	public List<Product> getAllProduct();

	public Product findById(Long id);

	public Product getById(Long id);

	public void saveProduct(Product product);

	public void updateProduct(Product product);

}
