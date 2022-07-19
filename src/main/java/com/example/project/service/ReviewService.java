package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.model.Review;


@Service
public interface ReviewService {

	 public List<Review> getAllReviewRating(int pageNo, int pageSize, String sortBy);

	public Review findById(Long id);

	int totalReviewedProduct();

	List<Review> getALlReviews();

	
}
