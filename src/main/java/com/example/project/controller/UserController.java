package com.example.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Address;
import com.example.project.model.User;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.GenericResponse;
import com.example.project.util.ServiceRegistry;

@RestController
public class UserController {
	
	@Autowired
	ServiceRegistry serviceRegistry;
	
	@GetMapping(ApplicationURLConstants.USER_USERLIST1)
	public DataTablesOutput<User> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {

	//	System.out.println("called");
		return serviceRegistry.userService.getAllByActiveTrue(dataTablesInput);

	}

	
	  @GetMapping(ApplicationURLConstants.USER_USERLIST) 
	  public ModelAndView getUserListPage() {
	  ModelAndView mv = new ModelAndView();
	  
		/* System.err.println("called"); */ 
	  mv.setViewName("users/userlist");
	  return mv;
	  }
	  
	  
	  
	  
	  
		@PostMapping(ApplicationURLConstants.USER_UNBLOCK)
		public ResponseEntity<Object> unBlockUser(@PathVariable Long id) {
			User us = serviceRegistry.userService.findById(id);
			us.setBlock_unblock("unblock");
			serviceRegistry.userService.saveUser(us);
			return ResponseEntity.ok(new GenericResponse());

		}

		@PostMapping(ApplicationURLConstants.USER_BLOCK)
		public ResponseEntity<Object> blockUser(@PathVariable Long id) {
			
	
			User us = serviceRegistry.userService.findById(id);
							us.setBlock_unblock("block");
							serviceRegistry.userService.saveUser(us);
							return ResponseEntity.ok(new GenericResponse());


		}
		
	  
		
		  @GetMapping(ApplicationURLConstants.USER_USERDETAIL_PATH) public ModelAndView
		  loadUserDetailsPage(@PathVariable Long id) { ModelAndView mv=new
		  ModelAndView();
		  
		  User userDetails= serviceRegistry.userService.findById(id);
		  
		  List<User> users=serviceRegistry.userService.getAllUser();
		  
	if(userDetails != null)
	{
		  List<Address> address=serviceRegistry.addressService.getAllAddress();
		  mv.addObject("address",address);
	}	 
	else
	{
		return null;
	}
		mv.addObject("users",users);
		  mv.setViewName("/users/userdetail");
		  mv.addObject("userdetails",userDetails);
		  
		  
		  return mv;
		  
		  
		  }
		  
		  
		  
		  
		 

	  
	  
}
