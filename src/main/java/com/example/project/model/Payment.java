package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	//private Order order;
	@OneToOne
	private OrderDetails order_details;
	
	@Column(name = "payent_success_code", nullable = false)  
	private Long paymentsuccesscode;
	
	@Column(name="OTP")
	private String otp;
	
	@Column(name = "payment_mode", nullable = false)  
	private String mode; //(COD, by card, UPI);
	
	@Column(name = "payment_status", nullable = false)  
	private String paymentstatus;
	
	@Column(name = "created_at", nullable = false)  
	private String createdAt;
	
	@Column(name = "transaction_id", nullable = false)  
	private String transcationID;

	
	
	@Column(name = "active", nullable = false)  
	private boolean active;
	
	

}
