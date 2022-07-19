package com.example.project.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="page_content")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page_content {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "description", nullable = false,columnDefinition = "text")
	private String description;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "createdAt")
	@CreationTimestamp
	private LocalDateTime created_at;
	
	@Column(name = "modifiesAt")
	@CreationTimestamp
	private LocalDateTime modified_at;
	
	@Column(name = "IsActive")
	private boolean active = true;
}
