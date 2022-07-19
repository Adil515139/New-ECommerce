package com.example.project.model;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
	
	 Placed("Placed"),Shipped("Shipped"), Posted("Posted"), Delivered("Delivered"), Cancelled("Cancelled");
	private String status;

	private OrderStatusEnum(final String status) {
		this.status = status;
	}

}
