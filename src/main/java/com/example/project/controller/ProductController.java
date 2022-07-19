package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Cart;
import com.example.project.model.OrderItem;
import com.example.project.model.Product;
import com.example.project.model.Product_liked;
import com.example.project.model.Review;
import com.example.project.model.Supplier;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.ServiceRegistry;
import com.example.project.validator.ProductValidator;

@RestController
public class ProductController {
	
	@Autowired
	ServiceRegistry serviceRegistry;
	
	
	@Autowired
	ProductValidator productValidator;
	
	
	@GetMapping(ApplicationURLConstants.PRODUCT_ADDPRODUCT) 
	  public ModelAndView loadAddProductPage() 
	  { 
		  ModelAndView mv=new ModelAndView();
	  try {
		  
		  List<Supplier> listofSuppliers=serviceRegistry.getSupplierService().getALLSupplier();
		  
		  
		  mv.addObject("supplier",listofSuppliers);
		  
		  mv.addObject("product",new Product());
		  
		  mv.setViewName("product/addproduct"); 
		  
		  
	
	  }catch (Exception e) {
		System.out.println(e);
	}
	  return mv;
	  
	  }
	
	
	@GetMapping("/product/sidebar") 
	  public ModelAndView loadroductPage() 
	  { 
		  ModelAndView mv=new ModelAndView();
	  try {
		  

		  
		  mv.setViewName("product/sidebar"); 
		  
		  
	
	  }catch (Exception e) {
		System.out.println(e);
	}
	  return mv;
	  
	  }

	
	@PostMapping(ApplicationURLConstants.PRODUCT_ADDPRODUCT)
	public ModelAndView processAddProducts( @ModelAttribute Product product)
	{
		ModelAndView mv=new ModelAndView();
	
		
		
	//	System.out.println("called");
	
		serviceRegistry.productService.addProduct(product);
		
		mv.addObject("product",new Product());

		mv.setViewName("redirect:/product/listproduct");
				
				return mv;
	
	}
	
	
	/*
	 * @GetMapping("/product/updateproduct") public ModelAndView
	 * loadUpdateProductPage() { ModelAndView mv=new ModelAndView(); try {
	 * 
	 * 
	 * List<Supplier>
	 * listofSuppliers=serviceRegistry.getSupplierService().getALLSupplier();
	 * 
	 * 
	 * mv.addObject("supplier",listofSuppliers); mv.addObject("product",new
	 * Product()); mv.setViewName("product/updateproduct");
	 * 
	 * 
	 * 
	 * }catch (Exception e) { System.out.println(e); } return mv;
	 * 
	 * }
	 */
	
	 

		@GetMapping(ApplicationURLConstants.PRODUCT_UPDATEPRODUCT_PATH)
		public ModelAndView processUpdateProduct(@PathVariable(name="id") Long id,@ModelAttribute Product product)
		{
			ModelAndView mv=new ModelAndView();
		
		//	System.out.println("called");
			
			mv.addObject("product",serviceRegistry.productService.getById(id));
			
			List<Supplier> listofSuppliers=serviceRegistry.getSupplierService().getALLSupplier();
			  
			  
			  mv.addObject("supplier",listofSuppliers);

			mv.setViewName("product/updateproduct");
			
			return mv;
			
			
			
			
		}
	  

		@RequestMapping(ApplicationURLConstants.PRODUCT_DELETEPRODUCT_PATH)
		public ModelAndView processDeleteProduct(@PathVariable(name="id") Long id)
		{
			ModelAndView mv=new ModelAndView();
		
		//	System.out.println("called");
			
			Product product=serviceRegistry.productService.findById(id);
			product.setIsactive(false);
				product.setStatus("offline");
				serviceRegistry.productService.saveProduct(product);


				mv.setViewName("redirect:/product/listproduct");
						
						return mv;
			
			
		}
		
		@PostMapping(ApplicationURLConstants.PRODUCT_UPDATEPRODUCT)
		public ModelAndView processUpdateProduct(@ModelAttribute Product product)
		{
			ModelAndView mv=new ModelAndView();
		
		//	System.out.println("called");
			
			serviceRegistry.productService.updateProduct(product);
			
			//mv.addObject("product",new Product());

			mv.setViewName("redirect:/product/listproduct");
			
			return mv;
				
			
		}
	  
		
		 @GetMapping(ApplicationURLConstants.PRODUCT_LISTPRODUCT) 
		  public ModelAndView loadlistProductPage() 
		  { 
			  ModelAndView mv=new ModelAndView();
		  try {
			 
			 List<Product> products = serviceRegistry.productService.getAllProduct();
			 
			 mv.addObject("products",  products);
			
			 List<Cart> carts=serviceRegistry.cartService.getAllCarts();
			
			 
			 if(carts.isEmpty()) {
				 System.err.println("null");
				 
			 }else
			 {
				 mv.addObject("cart",carts);
			 }
			 
			 List<OrderItem> orderItems=serviceRegistry.orderItemService.getAllOrderItems();
			 
			 mv.addObject("orderItems",orderItems);
			 
		//	 List<OrderDetails> orderDetails=serviceRegistry.orderDetailDataTableService.getAllOrderDetails();
			 
			 
			
		List<Review> reviews=serviceRegistry.reviewService.getALlReviews();
		
		mv.addObject("reviews",reviews);
		
		
		List<Product_liked> product_likeds=serviceRegistry.productLikeService.getAllProductLiked();
		
		mv.addObject("product_likeds",product_likeds);
		
		/*
		 * mv.addObject("reviewSize",
		 * serviceRegistry.reviewService.getReviewByProduct());
		 * 
		 * System.err.println(serviceRegistry.reviewService.getReviewByProduct());
		 * mv.setViewName("product/listproduct");
		 */
			
		  }catch (Exception e) {
			System.out.println(e);
		}
		  return mv;
		  
		  }
		 
		 
		 
		 
		 
			/*
			 * @GetMapping("/product/productdelete/{id}") public ModelAndView
			 * deleteProduct(@PathVariable(name="id") Long id) {
			 * 
			 * ModelAndView modelAndView = new ModelAndView();
			 * 
			 * Product product=serviceRegistry.productService.findById(id);
			 * 
			 * product.setIsactive(false);
			 * 
			 * serviceRegistry.productService.saveProduct(product);
			 * 
			 * modelAndView.setViewName("product/listproduct"); return modelAndView; }
			 */
		 
		 /*
			 * List<Cart> carts=new ArrayList<>();
			 * 
			 * for(Product product:products) { Cart
			 * cart=serviceRegistry.cartService.findById(product.getId());
			 * //cart.getQuantity();
			 * 
			 * carts.add(cart);
			 * 
			 * 
			 * }
			 */ 
			 
		 
			
			  
			/*
			 * if(products != null) {
			 * 
			 * List<Cart> cartss=products.ge
			 * 
			 * for(OrderItem orderItem : orderItems) {
			 * 
			 * System.out.println(orderItem);
			 * 
			 * }
			 */
			  
	//	 Product product=(Product) serviceRegistry.productService.getAllProduct();
		 
	
	/*
	 * List<Review> reviews=new ArrayList<>();
	 * 
	 * for(Product product:products) { Review
	 * review=serviceRegistry.reviewService.findById(product.getId());
	 * 
	 * reviews.add(review); }
	 * 
	 * System.out.println(reviews);
	 * 
	 */
		 
	/*
	 * List<Cart> carts=serviceRegistry.cartService.getAllCarts();
	 * 
	 * List<Product> products2=new ArrayList();
	 * 
	 * 
	 * 
	 * for(Cart cart:carts) {
	 * 
	 * products2.add(cart.getProduct());
	 * 
	 * } System.out.println(products2);
	 * 
	 * mv.addObject("productss",products2);
	 * 
	 */
		
		
}