package com.example.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.OrderDetails;
import com.example.project.model.OrderItem;
import com.example.project.model.Review;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.ServiceRegistry;

@RestController
public class OrderController {

	@Autowired
	DaoFactory daoFactory;
	
	@Autowired
	ServiceRegistry serviceRegistry;
	

	/*
	 * ----------------------get list
	 * Orders---------------------------------------------
	 */

	@GetMapping(ApplicationURLConstants.ORDER_LISTORDER1)
	public DataTablesOutput<OrderDetails> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {

	//	System.out.println("called");
		return serviceRegistry.orderDetailDataTableService.getAllByActiveTrue(dataTablesInput);
	
	}

	
	  @GetMapping(ApplicationURLConstants.ORDER_LISTORDER2) 
	  public ModelAndView getOrderListPage() {
	  ModelAndView mv = new ModelAndView();
	  
		/* System.err.println("called"); */ 
	  mv.setViewName("orders/listorders");
	  return mv;
	  }
	  
	  
	  
	  
		@GetMapping(ApplicationURLConstants.ORDERS_ORDERS_PENDINGLISTORDER)
		public DataTablesOutput<OrderDetails> getAllByStatusPending(@Valid DataTablesInput dataTablesInput) {

			//System.out.println("called");
			return serviceRegistry.pendingOrderService.getAllByOrderstatus(dataTablesInput);

		}

		
		  @GetMapping(ApplicationURLConstants.ORDERS_PENDINGORDERLIST) 
		  public ModelAndView getPendingOrderListPage() {
		  ModelAndView mv = new ModelAndView();
		  
			/* System.err.println("called"); */ 
		  mv.setViewName("orders/pendingorderlist");
		  return mv;
		  }
		  
		  
			@GetMapping(ApplicationURLConstants.ORDERS_ORDERS_SHIPPEDLISTORDER)
			public DataTablesOutput<OrderDetails> getAllByStatusShipped(@Valid DataTablesInput dataTablesInput) {

				//System.out.println("called");
				return serviceRegistry.shippedOrderService.getAllByOrderstatus(dataTablesInput);

			}

			
			  @GetMapping(ApplicationURLConstants.ORDERS_SHIPPEDORDERLIST) 
			  public ModelAndView getShippedOrderListPage() {
			  ModelAndView mv = new ModelAndView();
			  
				/* System.err.println("called"); */ 
			  mv.setViewName("orders/shippedorderlist");
			  return mv;
			  }
			  
			  
			  
				@GetMapping(ApplicationURLConstants.ORDERS_ORDERS_CANCELLEDLISTORDER)
				public DataTablesOutput<OrderDetails> getAllByStatusCancelled(@Valid DataTablesInput dataTablesInput) {

					//System.out.println("called");
					return serviceRegistry.cancelledOrderService.getAllByOrderstatus(dataTablesInput);

				}
                                                                
				
				  @GetMapping(ApplicationURLConstants.ORDERS_CANCELLEDORDERLIST) 
				  public ModelAndView getCancelledOrderListPage() {
				  ModelAndView mv = new ModelAndView();
				  
					/* System.err.println("called"); */ 
				  mv.setViewName("orders/cancelledorderlist");
				  return mv;
				  }
	  
	  
	  
	  @RequestMapping(ApplicationURLConstants.DELETE_ORDER_PATH)
	  public ModelAndView deleteOrder(@PathVariable Long id) {
		  ModelAndView mv=new ModelAndView();
		  
		  OrderDetails orderDetails=serviceRegistry.orderDetailDataTableService.findById(id);
		  
		  orderDetails.setActive(false);
		  orderDetails.setOrderstatus("Cancelled");
		  
		  serviceRegistry.orderDetailDataTableService.saveOrder(orderDetails);
		  
		  
		  mv.setViewName("redirect:/orders/orders/listorders");
		  return mv;
	  }
	  
	 
	// --------------------------------------------------------------------------------------
	  
		 @GetMapping("/orders/orderdetails/{id}") 
		  public ModelAndView loadOrderDetailsPage(@PathVariable Long id) 
		  { 
			  ModelAndView mv=new ModelAndView();
	
			  OrderDetails orderDetails= serviceRegistry.orderDetailDataTableService.findById(id);
		
			  if(orderDetails != null)
			  {
				  
			  List<OrderItem> orderItems=orderDetails.getOrderitem();
			  
			  for(OrderItem orderItem : orderItems) {
				  
				  System.out.println(orderItem);
				  
				  
				  
			  }
			  

			  Review review=serviceRegistry.reviewService.findById(orderDetails.getId());
			  
			  
			  List<OrderDetails> orderDetailss=serviceRegistry.orderDetailDataTableService.getAllOrderDetails();
			 
			  //System.err.println(orderDetailss);
			  
			  mv.addObject("order",orderDetailss);
			  
			  
			  List<Review> review2=serviceRegistry.reviewService.getALlReviews();
			  
			  
			  mv.addObject("review2",review2);
			  
			  System.err.println(review2);
			  if(review == null)
			  {
				  mv.addObject("review",null);
			  }
		
			  //System.err.println(review.getOrderDetails());
			 else {
			 mv.addObject("review",review);
			 } 
			 
			 mv.addObject("orderdetails",orderDetails);
			  mv.setViewName("/orders/orderdetails");
			//  System.err.println("size: " +orderDetails.getOrderitem().size());
		
			  
	
			  	return mv;
			  	
			  } else
				  
				  
				return null; 
			  
			  }
		 
		 
//		  @PostMapping("/orders/orderdetails")
//		  public ModelAndView updateOrderDetailsPage(@ModelAttribute OrderDetails orderDetails)
//		  {
//		  ModelAndView mv=new ModelAndView();
//
//		  OrderDetails orderDetail=daoFactory.orderDetailsRepository.findById(orderDetails.getId()).orElse(null);
//		  
//		
//		  orderDetail.setOrderstatus(orderDetails.getOrderstatus());
//		  
//		daoFactory.orderDetailsRepository.save(orderDetails);
//		
//		//mv.addObject("orderdetails",orderDetails);
//
//		  mv.setViewName("redirect:/orders/orders/listorders");
//		  
//		  
//		  return mv;
//		  }

		 
		 @PostMapping("/orders/orderdetails")
		 public ModelAndView updateStatus(@ModelAttribute OrderDetails orderDetails)
		 {
			 ModelAndView mv=new ModelAndView();
			 
				
		OrderDetails  orderDetails2=daoFactory.orderDetailsRepository.findById(orderDetails.getId()).orElse(null);
				  
				  
				  orderDetails2.setOrderstatus(orderDetails.getOrderstatus());
				  
				 
			 serviceRegistry.orderDetailDataTableService.updateOrderDetails(orderDetails2);
			// System.out.println(orderDetails.getOrderstatus());
			 ///.out.println("called");
			 
			 mv.setViewName("redirect:/orders/orders/listorders");
			 return mv;
			 
		 }
			
		
			 
}