package com.example.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Admin;
import com.example.project.model.Cart;
import com.example.project.model.ContactUs;
import com.example.project.model.OrderItem;
import com.example.project.model.Product;
import com.example.project.model.Product_liked;
import com.example.project.model.Review;
import com.example.project.service.AdminService;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.ServiceRegistry;

@RestController
//@RequestMapping("/admin")
public class HomeController {

	@Autowired
	ServiceRegistry serviceRegistry;

	@Autowired
	DaoFactory daoFactory;

	@Autowired
	AdminService adminService;

	@GetMapping(ApplicationURLConstants.ADMIN_DASHBOARD)
	public ModelAndView loadAdminDashboardPage() {
		ModelAndView mv = new ModelAndView();
		try {

			mv.addObject("totalUser", serviceRegistry.userService.totalUser());
			mv.addObject("totalContactUsUser", serviceRegistry.contactUsService.totalContactUsUser());
			mv.addObject("totalProductAvailable", serviceRegistry.productService.totalProductAvailable());
			mv.addObject("totalReviewedProduct", serviceRegistry.reviewService.totalReviewedProduct());
			mv.addObject("totalLikedProduct", serviceRegistry.productLikeService.totalLikeProduct());
			mv.addObject("pendingOrder", serviceRegistry.orderDetailDataTableService.totalPendingOrder());
			mv.addObject("shippedOrder", serviceRegistry.orderDetailDataTableService.totalShippedOrder());
			mv.addObject("CancelledOrder", serviceRegistry.orderDetailDataTableService.totalCancelledOrder());
			mv.setViewName("admin/dashboard");
			//System.out.println("hello");

			List<Product> products = serviceRegistry.productService.getAllProduct();

			mv.addObject("products", products);

			List<Cart> carts = serviceRegistry.cartService.getAllCarts();

			if (carts.isEmpty()) {
				System.err.println("null");

			} else {
				mv.addObject("cart", carts);
			}

			List<OrderItem> orderItems = serviceRegistry.orderItemService.getAllOrderItems();

			mv.addObject("orderItems", orderItems);

			// List<OrderDetails>
			// orderDetails=serviceRegistry.orderDetailDataTableService.getAllOrderDetails();

			List<Review> reviews = serviceRegistry.reviewService.getALlReviews();

			mv.addObject("reviews", reviews);

			List<Product_liked> product_likeds = serviceRegistry.productLikeService.getAllProductLiked();

			mv.addObject("product_likeds", product_likeds);

			/*
			 * mv.addObject("reviewSize",
			 * serviceRegistry.reviewService.getReviewByProduct());
			 * 
			 * System.err.println(serviceRegistry.reviewService.getReviewByProduct());
			 * mv.setViewName("product/listproduct");
			 */

		} catch (Exception e) {
			System.out.println(e);
		}
		return mv;
	}

	/*
	 * @GetMapping(ApplicationURLConstants.DASHBOARD_LISTPRODUCT) public
	 * ModelAndView loadlistProductPage() { ModelAndView mv=new ModelAndView(); try
	 * {
	 * 
	 * List<Product> products = serviceRegistry.productService.getAllProduct();
	 * 
	 * mv.addObject("products", products);
	 * 
	 * List<Cart> carts=serviceRegistry.cartService.getAllCarts();
	 * 
	 * 
	 * if(carts.isEmpty()) { System.err.println("null");
	 * 
	 * }else { mv.addObject("cart",carts); }
	 * 
	 * List<OrderItem>
	 * orderItems=serviceRegistry.orderItemService.getAllOrderItems();
	 * 
	 * mv.addObject("orderItems",orderItems);
	 * 
	 * // List<OrderDetails>
	 * orderDetails=serviceRegistry.orderDetailDataTableService.getAllOrderDetails()
	 * ;
	 * 
	 * 
	 * 
	 * List<Review> reviews=serviceRegistry.reviewService.getALlReviews();
	 * 
	 * mv.addObject("reviews",reviews);
	 * 
	 * 
	 * List<Product_liked>
	 * product_likeds=serviceRegistry.productLikeService.getAllProductLiked();
	 * 
	 * mv.addObject("product_likeds",product_likeds);
	 * 
	 * 
	 * mv.addObject("reviewSize",
	 * serviceRegistry.reviewService.getReviewByProduct());
	 * 
	 * System.err.println(serviceRegistry.reviewService.getReviewByProduct());
	 * mv.setViewName("product/listproduct");
	 * 
	 * 
	 * }catch (Exception e) { System.out.println(e); } return mv;
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/admin/contactus") public ModelAndView loadContactUsPage() {
	 * ModelAndView mv=new ModelAndView(); try {
	 * 
	 * 
	 * mv.setViewName("admin/contactus"); System.out.println("hello");
	 * 
	 * }catch (Exception e) { System.out.println(e); } return mv; }
	 */

	@GetMapping(ApplicationURLConstants.ADMIN_VIEWUSER)
	public ModelAndView loadConnectedUserPage() {
		ModelAndView mv = new ModelAndView();
		try {

			mv.setViewName("admin/viewUser");
			System.out.println("hello");

		} catch (Exception e) {
			System.out.println(e);
		}
		return mv;
	}

	@GetMapping("/admin/changepassword")
	public ModelAndView loadChangePasswordPage() {
		ModelAndView mv = new ModelAndView();
		try {

			mv.setViewName("admin/changepassword");

			mv.addObject("admin", new Admin());

			/*
			 * System.out.println("hello");
			 */
		} catch (Exception e) {
			System.out.println(e);
		}
		return mv;
	}

	/*
	 * @GetMapping("/product/listproduct") public ModelAndView loadListProductPage()
	 * { ModelAndView mv=new ModelAndView(); try {
	 * mv.setViewName("product/listproduct");
	 * 
	 * 
	 * 
	 * }catch (Exception e) { System.out.println(e); } return mv;
	 * 
	 * }
	 */

	/*
	 * @GetMapping("/users/userlist") public ModelAndView loadUserListPage() {
	 * ModelAndView mv=new ModelAndView(); try { mv.setViewName("users/userlist");
	 * 
	 * }catch (Exception e) { System.out.println(e); } return mv;
	 * 
	 * }
	 */
	/*
	 * @GetMapping("/orders/listorders") public ModelAndView loadOrdersListPage() {
	 * ModelAndView mv=new ModelAndView(); try {
	 * mv.setViewName("orders/listorders");
	 * 
	 * }catch (Exception e) { System.out.println(e); } return mv;
	 * 
	 * }
	 */

	@GetMapping(ApplicationURLConstants.ADMIN_ADMIN_LISTCONTACTUS)
	public DataTablesOutput<ContactUs> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {

		// System.out.println("called");
		return serviceRegistry.contactUsService.getAllByActiveTrue(dataTablesInput);

	}

	@GetMapping(ApplicationURLConstants.ADMIN_LISTCONTACTUS)
	public ModelAndView getContactUsListPage() {
		ModelAndView mv = new ModelAndView();

		// System.err.println("called");
		mv.setViewName("admin/contactuslist");
		return mv;
	}

	@GetMapping(ApplicationURLConstants.ADMIN_CONTACTUSDETAILS_PATH)
	public ModelAndView loadContactUsDetailsPage(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView();

		ContactUs contactUsDetails = serviceRegistry.contactUsService.findById(id);

		mv.setViewName("/admin/contactusdetails");
		mv.addObject("contactUsDetails", contactUsDetails);
		return mv;

	}

}
