package com.example.project.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.project.repository.AddressRepository;
import com.example.project.repository.AdminRepository;
import com.example.project.repository.CartPaggingRepository;
import com.example.project.repository.CartRepository;
import com.example.project.repository.ContactUsRepository;
import com.example.project.repository.FaqsRepository;
import com.example.project.repository.OrderDetailsRepository;
import com.example.project.repository.OrderItemRepository;
import com.example.project.repository.ReviewPaggingRepository;
//import com.example.project.repository.OrderRepository;
import com.example.project.repository.OtpRepository;
import com.example.project.repository.PageContentRepository;
import com.example.project.repository.PaymentRepository;
import com.example.project.repository.ProductRepository;
import com.example.project.repository.Product_Like_Repository;
import com.example.project.repository.ProductsPaggingRepository;
import com.example.project.repository.ReviewRepository;
import com.example.project.repository.SupplierRepository;
import com.example.project.repository.UserRepository;

import lombok.Getter;

@Component
@Getter
public class DaoFactory {
	
	@Autowired
	public AdminRepository adminRepository;
	
	@Autowired
	public CartPaggingRepository cartPaggingRepository;
	
	@Autowired
	public CartRepository cartRepository;
	
	@Autowired
	public OtpRepository otpRepository;
	
	@Autowired
	public Product_Like_Repository product_Like_Repository;
	
	@Autowired
	public ProductRepository productRepository;
	
	@Autowired
	public ProductsPaggingRepository productsPaggingRepository;
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public OrderDetailsRepository orderDetailsRepository;

	@Autowired
	public OrderItemRepository orderItemRepository;

	@Autowired
	public PaymentRepository paymentRepository;
	
	@Autowired
	public ReviewRepository reviewRepository;
	
	@Autowired
	public ContactUsRepository contactUsRepository;
	
	@Autowired
	public ReviewPaggingRepository reviewPaggingRepository;
	
	@Autowired
	public AddressRepository addressRepository;
	
	@Autowired
	public SupplierRepository supplierRepository;
	
	@Autowired
	public PageContentRepository pageContentRepository;
	
	@Autowired
	public FaqsRepository faqsRepository;
	
	
}
