
  package com.example.project.model;
  
  import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
  
  @Entity
  @Table(name = "order_details")
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class OrderDetails {
  
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id;
  
  

  @OneToOne
  @JoinColumn(name="user_id")
  private User user;
  
  @Column(name = "subtotal") 
  private Long subTotal;
  
  @Column(name = "item_discount") 
  private Long item_discount;
  
  @Column(name = "tax") 
  private Long tax;
  
  @Column(name = "total") 
  private Long total;
  
	
	  @Column(name = "createdat")
	  private String createdAt;
	 
  
  @Column(name = "active") 
  private boolean active=true;
  
  @Column(name = "order_status")
  private String orderstatus;
	 
  
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name="order_item")
  public List<OrderItem> orderitem;

  @OneToOne
  public Payment payment;
  


  }
 
