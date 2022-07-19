package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.model.Admin;
import com.example.project.service.AdminService;
import com.example.project.util.ApplicationURLConstants;

@Controller
public class AdminLoginController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	HttpSession session;
	
	
	 @GetMapping(path ={"/",ApplicationURLConstants.Login}) 
	  public ModelAndView loadAdminLoginPage() 
	  { 
		  ModelAndView mv=new ModelAndView();
	  try {
		  mv.setViewName("login"); 
		  
		  mv.addObject("admin",new Admin());
	
	  }catch (Exception e) {
		System.out.println(e);
	}
	  return mv;
	  
	  }
	
	  @PostMapping(ApplicationURLConstants.Login)
	  public ModelAndView loginAdmin(@ModelAttribute Admin admin,HttpServletRequest request) {
		  ModelAndView mv=new ModelAndView();
		
		 try {
		boolean admins =  adminService.processLogin(admin);
		 if(admins)
		 {
			// Admin admisfromdata=adminService.getAdmin(admin);
			 
			 //session.setAttribute("admin", admisfromdata);
			 HttpSession session=request.getSession(true);
			 
			 mv.addObject("admin",adminService.getAdmin(admin));
			 
				/* System.err.println(adminService.getAdmin(admin)); */
			 
				session.setAttribute("admin", adminService.getAdmin(admin));
				
			 mv.addObject("admin",new Admin());
			 mv.setViewName("redirect:admin/dashboard");
		 }
		 else {
			  
			  mv.setViewName("redirect:login"); 
			  
			  }
		
			
		 }catch (Exception e) {
			System.out.println(e);
		}
		return mv;
	  }
	
	
		 @GetMapping(ApplicationURLConstants.ADMIN_PROFILE) 
		  public ModelAndView loadAdminProfilePage() 
		  { 
			  ModelAndView mv=new ModelAndView();
		
			  
			  mv.addObject("admin",new Admin());
			  
			  mv.setViewName("admin/profile"); 
		

		  return mv;
		 
		  }
		 
		 
		  @GetMapping(ApplicationURLConstants.ADMIN_UPDATEPROFILE)
		  public ModelAndView loadUpdateProfilePage(HttpServletRequest request) {
			  ModelAndView mv=new ModelAndView();
			  try {
				  
				Admin admin= (Admin) request.getSession().getAttribute("admin");
				  
				//  mv.addObject("admin",new Admin());
				  mv.addObject("admin",admin);
				  
				 // System.out.println(session.getAttribute("admin"));
				  mv.setViewName("admin/updateprofile");  
		 // System.out.println("hello");
		  
		  }catch (Exception e) 
			  { System.out.println(e); 
			  } return mv;
			  }
	
		  
		  @PostMapping(ApplicationURLConstants.ADMIN_UPDATEPROFILE)
			public ModelAndView processUpdateAdminProfile(@ModelAttribute Admin admin ,HttpServletRequest request){
				
				ModelAndView mv=new ModelAndView();
				
				//	User users=(User) request.getSession(false).getAttribute("user");
					
					adminService.updateAdmin(admin);
					 
					  mv.setViewName("admin/profile");  
					return mv;
				
			}
		  
	@GetMapping(ApplicationURLConstants.Logout)
	public ModelAndView processLogout(HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		HttpSession session = request.getSession(false);
		session.removeAttribute("admin");
		
		session.invalidate();
		
		modelAndView.addObject("admin",new Admin());
		modelAndView.setViewName("login");
		return modelAndView;
	}
}
