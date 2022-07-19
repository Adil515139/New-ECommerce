package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="user_address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	@Id	
	@GeneratedValue
	private Long id;
	
	//user_id
	 @ManyToOne
	 @JoinColumn(name="user")
	 private User user;
	
	@Column(name = "address", nullable = false)
	private String street_and_landmark;
	
	
	@Column(name = "area", nullable = false)   
	private String area;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "pincode", nullable = false)
	private Long pincode;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "country", nullable = false)
	private String country;
	
	
	

}
