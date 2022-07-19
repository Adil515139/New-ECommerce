package com.example.project.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Product;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.GenericMessageResponse;

@RestController
@RequestMapping(ApplicationURLConstants.ADMIN_API)
public class AdminApiController {
	
	@Autowired
	private DaoFactory daoFactory;
	
	//@Autowired
	//private ProductRepository productRepository;
	
	  @PostMapping(ApplicationURLConstants.ADMIN_ADD_PRODUCT)
	  public ResponseEntity<Object> addProductByAdmin(@RequestBody Product product) {
		 try {
			 if(product!=null)
			 
			daoFactory.productRepository.save(product);
			  
			  return ResponseEntity.ok(new GenericMessageResponse("200","Successfully Product is Added"));
		 }catch (Exception e) {
		System.err.println(e);
		}
		 return ResponseEntity.ok(new GenericMessageResponse("404","Error"));
		 
	  }

}
