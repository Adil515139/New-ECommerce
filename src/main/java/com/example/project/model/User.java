package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

    @Column(name = "email", unique = true, nullable = false)
	private String email;
	
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
	private String lastname;
	
    @Column(name = "password")
	private String password;

    @Column(name = "gender")
	private String gender;
	
    @Column(name = "mobile")
	private Long mobile_no;
	
   
    @Column(name="IsLogin")
    private String islogin;

    @Column(name="OTP")
	private String O_T_P;
    
    @Column(name = "createdAt")
	private String created_at;
	
	@Column(name = "modifiedAt")
	private String modified_at;
	
	@Column(name = "active")
	private boolean active ;
	
	@Column(name="block_unblock")
	private String block_unblock;
	
	/*
	 * @OneToOne(mappedBy = "user") private Product_liked product_liked;
	 */
	
	
	
	
	
	  
	 
  
}
