package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_liked")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product_liked {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	//product_id
	
	@OneToOne  
	@JoinColumn(name="product_id")
	private Product product;
	 
	
	//userID
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	                  
	@Column(name="status")
	private Boolean status = false;
	
	@Column(name = "createdAt", nullable = false)
	private String created_at;
	

	
	@Column(name = "IsActive", nullable = false)
	private boolean active;

	
		
	
}
