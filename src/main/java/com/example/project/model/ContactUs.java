package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="contactUs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactUs {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name="name")
	private String name;
	
	@Column(name = "feedback", nullable = false)
	private String feedback;
	
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "IsActive", nullable = false)
	private boolean active;
}
