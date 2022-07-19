package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="review")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Product_id
	@ManyToOne
	private Product product;
	
	@OneToOne
	private OrderDetails orderDetails;
	
	@Column(name = "review")
	private String review;
	
	
	@Column(name="rating")
	private Long rating;
	
	@Column(name = "review_date")
	private String review_date;
	
	
	@Column(name = "IsActive")
	private boolean active;
}
