package com.example.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Product_liked;
import com.example.project.service.ProductLikeService;
import com.example.project.util.DaoFactory;

@Service
public class ProductLikeServiceImpl implements ProductLikeService {

	
	@Autowired
	DaoFactory daoFactory;
	@Override
	public int totalLikeProduct() {

		return daoFactory.product_Like_Repository.findAll().size();
	}
	@Override
	public List<Product_liked> getAllProductLiked() {
		return daoFactory.product_Like_Repository.findAll();
	}



}
