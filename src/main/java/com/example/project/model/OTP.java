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
@Table(name="otp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OTP {
	
	

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name="otp_code", length = 4)
    private String otp_code;
	/*
	 * @Column(name = "createdAt", nullable = false)
	 * 
	 * @CreationTimestamp private Date created_at;
	 */
    @Column(name = "createdAt", nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @Column(name = "IsActive", nullable = false)
	private boolean active;
    
	/*
	 * @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(nullable = false, name = "user_id") private User user;
	 */
}
