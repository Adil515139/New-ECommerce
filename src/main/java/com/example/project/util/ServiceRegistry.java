package com.example.project.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.project.service.AddressService;
import com.example.project.service.AdminService;
import com.example.project.service.CancelledOrderService;
import com.example.project.service.CartService;
import com.example.project.service.ContactUsService;
import com.example.project.service.EmailSenderService;
import com.example.project.service.FaqsService;
import com.example.project.service.OrderDetailDataTableService;
import com.example.project.service.OrderItemService;
import com.example.project.service.OtpService;
import com.example.project.service.PaymentService;
import com.example.project.service.PendingOrderService;
import com.example.project.service.ProductLikeService;
import com.example.project.service.ProductService;
import com.example.project.service.ReviewService;
import com.example.project.service.ShippedOrderService;
import com.example.project.service.SupplierService;
import com.example.project.service.UserService;

import lombok.Getter;

@Component
@Getter
public class ServiceRegistry {

	@Autowired
	public AdminService adminService;
	
	@Autowired
	public	CartService cartService;
	
	@Autowired
	public EmailSenderService emailSenderService;
	
	@Autowired
	public OtpService otpService;
	
	@Autowired
	public ProductService productService;
	
	@Autowired
	public ProductLikeService productLikeService;
	
	@Autowired
	public UserService userService;
	
	@Autowired
	public ReviewService reviewService;
	
	@Autowired
	public OrderDetailDataTableService orderDetailDataTableService;

	@Autowired
	public PaymentService paymentService;
	
	
	@Autowired
	public AddressService addressService;
	
	@Autowired
	public ContactUsService contactUsService;
	
	@Autowired
	public SupplierService supplierService;
	
	@Autowired
	public OrderItemService orderItemService;
	
	@Autowired
	public FaqsService faqsService;
	
	@Autowired
	public PendingOrderService pendingOrderService;

	@Autowired
	public ShippedOrderService shippedOrderService;

	@Autowired
	public CancelledOrderService cancelledOrderService;
	 
}
