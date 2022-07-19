package com.example.project.dto.request;

import com.example.project.model.OrderDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {


	private Long paymentsuccesscode;
	
	private String otp;
 
	private String mode; //(COD, by card, UPI);
	
  
	private OrderDetails order_details;
	
	private String paymentstatus;
	
	private String createdAt;
	 
	private String transcationID;

	 
	private Boolean active;
	
}
