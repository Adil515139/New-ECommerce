package com.example.project.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="faqs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faqs {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "question", nullable = false)
	private String question;
	
	@Column(name = "answer", columnDefinition ="text")
	private String answer;
	
	@Column(name = "createdat")
	@CreationTimestamp
	private LocalDateTime createdat;
	
	@Column(name = "modifiedat" ,updatable = true)
	@UpdateTimestamp
	private LocalDateTime modifiedat;
	
	@Column(name = "IsActive")
	private boolean active = true;

}
