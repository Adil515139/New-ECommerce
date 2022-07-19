package com.example.project.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name = "product_name")
	private String product_name;
	
    @Column(name = "product_description", columnDefinition ="text")
	private String description;
	

	
    @Column(name = "product_quantity", nullable = false)
	private Long quantity;
	
    @Column(name = "product_price", nullable = false)
	private Long price;
	
    @Column(name = "product_discount")
	private Long discount;
	

	
    @CreationTimestamp
	private LocalDateTime  created_at;
	
    @UpdateTimestamp
	private LocalDateTime modified_at;
	
 
    @Column(name="Isactive")
    private boolean isactive=true;
    
    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="supplier_id")
    private Supplier supplier;
    
    
    
}
                                                             