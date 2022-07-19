package com.example.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Review;
import com.example.project.service.ReviewService;
import com.example.project.util.DaoFactory;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	public DaoFactory daoFactory;
	
	@Override
	public List<Review> getAllReviewRating(int pageNo, int pageSize, String sortBy) {
		  Pageable paging = PageRequest.of(pageNo, pageSize,
				  Sort.by("id").ascending());
				  
				  Page<Review> pagedResult = daoFactory.reviewPaggingRepository.findAll(paging);
				  
				  if(pagedResult.hasContent()) {
					  return pagedResult.getContent();
				  }
				  else{
				  return new ArrayList<Review>();
				  
				  } 
	}

	@Override
	public Review findById(Long id) {
		
		
		return daoFactory.reviewRepository.getById(id);
	}
	
	@Override
	public int totalReviewedProduct() {
		
		return daoFactory.reviewRepository.findAll().size();
		
	}


	@Override
	public List<Review> getALlReviews() {
		return daoFactory.reviewRepository.findAll();
	}

	

	
}
