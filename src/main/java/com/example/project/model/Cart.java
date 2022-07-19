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
@Table(name="cart")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//product_id
	@OneToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	//userID
	@OneToOne
	private User user;
	
	@Column(name = "quantity", nullable = false)
	private Long quantity;
	
	@Column(name = "created_at", nullable = false)
	private String created_at;
	
	
	@Column(name = "modified_at", nullable = false)
	private String modified_at;
	

	
	@Column(name = "IsActive", nullable = false)
	private boolean active;
	

}
