package com.example.project.controller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.request.OrderDto;
import com.example.project.dto.request.OrderItemDto;
import com.example.project.dto.request.PaymentDto;
import com.example.project.dto.request.ReviewDto;
import com.example.project.model.OrderDetails;
import com.example.project.model.OrderItem;
import com.example.project.model.OrderStatusEnum;
import com.example.project.model.Payment;
import com.example.project.model.Product;
import com.example.project.model.Review;
import com.example.project.model.User;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.GenericMessageResponse;
import com.example.project.util.GenericResponse;
import com.example.project.util.ServiceRegistry;

@RestController
@RequestMapping(ApplicationURLConstants.ORDER_API)
public class OrderApiController {

	@Autowired
	private ServiceRegistry serviceRegistry;

	@Autowired
	private DaoFactory daoFactory;

	

	@RequestMapping(ApplicationURLConstants.ORDER_PLACED)
	public ResponseEntity<Object> addToOrder(@RequestBody OrderDto orderDto) {

		OrderDetails orderDetails = new OrderDetails();
		try {

			User myUser = daoFactory.getUserRepository().findById(orderDto.getUser()).orElse(null);
			Payment payment=daoFactory.getPaymentRepository().findById(orderDto.getPayment()).orElse(null);
			
			if (myUser == null)
				return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));

			orderDetails.setUser(myUser);
			
			if(payment==null)
				return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
			orderDetails.setPayment(payment);

			List<OrderItem> orderedProducts = new ArrayList<OrderItem>();

			for (OrderItemDto item : orderDto.getOrderitem()) {
				Product product = daoFactory.getProductRepository().findById(item.getProduct_id()).orElse(null);
				OrderItem orderItem = new OrderItem();
				if (product != null) {
					orderItem.setProduct(product); 
					orderItem.setQuantity(item.getQuantity());
					orderItem.setActive(true);
					orderedProducts.add(orderItem);
					
				}
			}

			BeanUtils.copyProperties(orderDto, orderDetails);

			orderDetails.setOrderitem(orderedProducts);

			System.out.println("==>" + orderDetails);

//			orderDetails.setOrderstatus(OrderStatusEnum.Cancelled.getStatus());
//			orderDetails.setOrderstatus(OrderStatusEnum.Delivered.getStatus());
//			orderDetails.setOrderstatus(OrderStatusEnum.Posted.getStatus());
//			orderDetails.setOrderstatus(OrderStatusEnum.Shipped.getStatus());
			
			orderDetails.setOrderstatus(OrderStatusEnum.Placed.getStatus());
			
		//	System.out.println(OrderStatusEnum.Placed.getStatus());
			daoFactory.orderDetailsRepository.save(orderDetails);

			return ResponseEntity.ok(new GenericMessageResponse("200", "Order has been Placed"));
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));

	}

	@RequestMapping(ApplicationURLConstants.PAYMENT_VERIFICATION)
	public ResponseEntity<Object> paymentMethod(@RequestBody PaymentDto paymentDto)

	{
		Payment payment = new Payment();
		try {
			//Random random = new Random();
			//String paymentotp = String.format("%04d", random.nextInt(10000));

			//paymentVerfiyOtp.setPaymentotp(paymentotp);

			BeanUtils.copyProperties(paymentDto, payment);
			//System.out.println(paymentVerfiyOtp);

		Payment p=	daoFactory.paymentRepository.save(payment);
			if(p.isActive())
			return ResponseEntity.ok(new GenericMessageResponse("200", "Payment SuccessFull"));
			else {
				return ResponseEntity.ok(new GenericMessageResponse("404","error"));
			}
				/*
			 * else { return ResponseEntity.ok(new
			 * GenericMessageResponse("201","Payment Failed")); }
			 */

		} catch (Exception e) {
			System.out.println(e);
		}

		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}

	@GetMapping(ApplicationURLConstants.GET_ORDER_LIST_PATH)
	public ResponseEntity<Object> getOrderListWithStatus(@PathVariable("orderstatus") String orderstatus,
			@ModelAttribute OrderDetails orderDetails) {
		try

		{ // Produuct likeProducts = productRepository.getByProduct_Liked();

			///System.out.println(orderstatus);
			
			List<OrderDetails> orderDetailsList = daoFactory.orderDetailsRepository.findOrderByOrderstatus(orderstatus);
			//System.out.println(orderDetailsList);
			
			return ResponseEntity.ok(new GenericResponse("200", "Success", orderDetailsList));
		} catch (Exception e) {
			System.out.println(e);
		}

		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}

	@GetMapping(ApplicationURLConstants.GET_ORDER_STATUS_PATH)
	public ResponseEntity<Object> getOrderWithStatus(@PathVariable("id") Long id,
			@ModelAttribute OrderDetails orderDetails) {
		try {
			// Product likeProducts=productRepository.getByProduct_Liked();

			//System.out.println(id);

			String orderDetailsByID = daoFactory.orderDetailsRepository.GetOrderStatusById(id);

			//System.out.println(orderDetailsByID);

			return ResponseEntity.ok(new GenericResponse("200", "Success", orderDetailsByID));
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}
	
	
	@RequestMapping(ApplicationURLConstants.GET_PRODUCT_BY_ORDER_PATH)
	public ResponseEntity<Object> getProductByOrder(@PathVariable("id") Long id ,@ModelAttribute OrderDetails orderDetails)
	{
		try {
			
			OrderDetails ord=daoFactory.orderDetailsRepository.GetProductByOrderId(id);
			
			List<OrderItem>  ords=ord.getOrderitem();
			
				
			
						
			return ResponseEntity.ok(new GenericResponse("200", "Success", ords));
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}
	
	@RequestMapping(ApplicationURLConstants.REVIEW_PRODUCT)
	public ResponseEntity<Object> addReview(@RequestBody ReviewDto reviewdto) {

		Review review=new Review();
		try {

			OrderDetails Order = daoFactory.getOrderDetailsRepository().findById(reviewdto.getOrderDetailsId()).orElse(null);
			if (Order == null)
				return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));

			Product product = daoFactory.getProductRepository().findById(reviewdto.getProductId()).orElse(null);
			
			review.setOrderDetails(Order);
			
			review.setProduct(product);

			BeanUtils.copyProperties(reviewdto, review);
			
			daoFactory.reviewRepository.save(review);
			
			return ResponseEntity.ok(new GenericMessageResponse("200", "Review Added"));

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));

	}
	
	@RequestMapping(ApplicationURLConstants.GET_REVIEW_LIST)
	public ResponseEntity<Object> getReviewList(@ModelAttribute Review review) {
		try {
			// Product likeProducts=productRepository.getByProduct_Liked();

			
			List<Review> reviewsList = daoFactory.reviewRepository.findAll();
			
			return ResponseEntity.ok(new GenericResponse("200", "Success", reviewsList));
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}
	
	@RequestMapping(ApplicationURLConstants.GET_LIST_REVIEW_RATING_PATH)
	public ResponseEntity<List<Review>> getReiewRatingList(@PathVariable("pageNo") int pageNo,
			@RequestParam(defaultValue = "5") int pageSize, @RequestParam(defaultValue = "id") String sortBy) {

		List<Review> reviews = new ArrayList<Review>();

		reviews = serviceRegistry.reviewService.getAllReviewRating(pageNo, pageSize, sortBy);

		return new ResponseEntity<List<Review>>(reviews, new HttpHeaders(), HttpStatus.OK);

	}
	

	
}
