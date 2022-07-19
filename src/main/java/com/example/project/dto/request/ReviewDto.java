package com.example.project.dto.request;

import lombok.Data;

@Data
public class ReviewDto {
	
	private Long productId;
	
	
	private Long orderDetailsId;
	
	private Long rating; 
	
	private String review;
	
	
	
	private String review_date;
	
	
	
	private Boolean active;
}
