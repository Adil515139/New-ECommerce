package com.example.project.dto.request;

import java.util.List;

import lombok.Data;

@Data
public class OrderDto {
	  private Long id;
	  
	  private Long user;
	  
	  private Long subTotal;
	  
	  private Long item_discount;
	  
	  
	  private Long tax;
	  
	   
	  private Long total;
	  
	  
	  private String createdAt;
	  
	   
	  private Boolean active = true;
	  
	 
	  private String orderstatus;
	  
	  public List<OrderItemDto> orderitem;
	  
	  public Long payment;
	
}
