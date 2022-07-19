package com.example.project.dto.request;

import lombok.Data;


@Data
public class AddressDto {
	 
	 private Long userId;
	
	private String street_and_landmark;
	
	
	
	private String area;
	
	
	private String city;
	
	
	private Long pincode;
	
	
	private String state;
	
	
	private String country;
}
