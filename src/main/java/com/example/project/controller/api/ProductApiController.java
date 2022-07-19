package com.example.project.controller.api;

import java.util.ArrayList;
import java.util.List;

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

import com.example.project.model.Cart;
import com.example.project.model.Product;
import com.example.project.model.Product_liked;
import com.example.project.service.CartService;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.GenericMessageResponse;
import com.example.project.util.GenericResponse;
import com.example.project.util.ServiceRegistry;

@RestController
@RequestMapping(ApplicationURLConstants.PRODUCT_API)
public class ProductApiController {

	@Autowired
	private ServiceRegistry serviceRegistry;

	@Autowired
	private DaoFactory daoFactory;

	@Autowired
	private CartService cartService;
	
	
	@RequestMapping(ApplicationURLConstants.GET_PRODUCT_LIST_PATH)
	public ResponseEntity<List<Product>> getProductList(@PathVariable("pageNo") int pageNo,
			@RequestParam(defaultValue = "3") int pageSize, @RequestParam(defaultValue = "id") String sortBy) {

		List<Product> products = new ArrayList<Product>();

		products = serviceRegistry.productService.getAllProducts(pageNo, pageSize, sortBy);

		return new ResponseEntity<List<Product>>(products, new HttpHeaders(), HttpStatus.OK);

	}

	/*
	 * @RequestMapping("/get-product-list") public ResponseEntity<Object>
	 * getProductList() { List<Product> products=productRepository.findAll(); return
	 * ResponseEntity.ok(new GenericResponse("200","Success",products));
	 * 
	 * 
	 * }
	 */

	@RequestMapping(ApplicationURLConstants.GET_PRODUCT_DETAIL_PATH)
	public ResponseEntity<Object> getProductDetail(@PathVariable("id") String id) {
		try {
			Product productDetail = daoFactory.productRepository.findById(Long.parseLong(id)).orElse(null);

			return ResponseEntity.ok(new GenericResponse("202", "Success", productDetail));
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Not Found"));
	}

	@RequestMapping(ApplicationURLConstants.LIKE_SPECIFIC_PRODUCT)
	public ResponseEntity<Object> likeSpecificProduct(@RequestBody Product_liked product_liked) {
		try {

			// Product_liked
			// productfromdatabase=product_Like_Repository.findById(product_liked.getProduct().getId());
			// if(productfromdatabase.equals(product_liked.getProduct().getId())) {

			// return ResponseEntity.ok(new GenericMessageResponse("200","wishlist
			// ghsdfkwejr added" ));
			// }else {

			daoFactory.product_Like_Repository.save(product_liked);
			return ResponseEntity.ok(new GenericMessageResponse("200", "wishlist successfully added"));
			// }

		} catch (Exception e) {

		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}

	@GetMapping(ApplicationURLConstants.GET_LIKED_PRODUCT_LIST)
	public ResponseEntity<Object> getLikedProductList(@ModelAttribute Product product) {
		try {
			// Product likeProducts=productRepository.getByProduct_Liked();

			List<Product_liked> productLikedList = daoFactory.product_Like_Repository.findAll();
			return ResponseEntity.ok(new GenericResponse("200", "Success", productLikedList));
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}
	
	
	@RequestMapping(ApplicationURLConstants.ADD_TO_CART)
	public ResponseEntity<Object> addToCart(@RequestBody Cart cart) {

	
		try {
			// Cart
			// cartFromdatabase=daoFactory.cartRepository.findByProduct(cart.getProduct());
			// if(cartFromdatabase.getProduct().equals(cart.getProduct())){
			// return ResponseEntity.ok(new GenericMessageResponse("202","Already Added in
			// Cart"));
			// }
			// else {
				
			// }
			
			daoFactory.cartRepository.save(cart);
			return ResponseEntity.ok(new GenericMessageResponse("200", "Added To Cart"));

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));

	}

	@RequestMapping(ApplicationURLConstants.GET_CART_LIST_PATH)
	public ResponseEntity<List<Cart>> getCartList(@PathVariable("pageNo") int pageNo,
			@RequestParam(defaultValue = "5") int pageSize, @RequestParam(defaultValue = "id") String sortBy) {

		List<Cart> carts = new ArrayList<Cart>();

		carts = cartService.getAllCart(pageNo, pageSize, sortBy);

		return new ResponseEntity<List<Cart>>(carts, new HttpHeaders(), HttpStatus.OK);

	}

	@RequestMapping(ApplicationURLConstants.ADD_REMOVE_QUANTITY)
	public ResponseEntity<Object> addAndRemoveQuantity(@RequestBody Cart cart) {
		Cart cartFromdatabase = daoFactory.cartRepository.getById(cart.getId());
		try {

			if (cart.getQuantity().equals(cartFromdatabase.getQuantity())) {
				return ResponseEntity.ok(new GenericMessageResponse("201", "Doesn't Change"));
			}

			daoFactory.cartRepository.save(cart);
		} catch (Exception e) {

			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("200", "Add and Remove"));

	}

	
}
