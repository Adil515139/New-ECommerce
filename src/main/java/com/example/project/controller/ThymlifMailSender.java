package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.User;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.GenericMessageResponse;
import com.example.project.util.ServiceRegistry;

@RestController
@RequestMapping(ApplicationURLConstants.USER_API)
public class ThymlifMailSender {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@Autowired
	ServiceRegistry serviceRegistry;
	
	@Autowired
	DaoFactory daoFactory;
	
	@PostMapping(ApplicationURLConstants.REGISTERTHYMLIF)
	public ResponseEntity<Object> saveUser(@RequestBody User user, HttpServletRequest request) {
		try {
			
			
			daoFactory.userRepository.save(user);
			serviceRegistry.emailSenderService.sendThymlifTemplate(user);

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("200", "Successfully Register"));
	
	}
	
//	
//	@PostMapping("/userprofile/contactus")
//	public ModelAndView ProcessContactUs(HttpServletRequest request , @ModelAttribute ContactUs contactus ) throws MessagingException {
//		ModelAndView modelAndView = new ModelAndView();
//		HttpSession session = request.getSession(true);
//		User user = (User) session.getAttribute("user");
//	
//		modelAndView.addObject("success","Request Sent Successfully !!"); 
//		 Map<String, Object> properties = new HashMap<>();
//			properties.put("user", user);
//			properties.put("contactus", contactus);
//			
//		  String to = "nishil.pjpt@gmail.com"; 
//		  String subject = "LMS Portal Query"; 
//		  String body = "appliedquery.html";
//		  
//		  emailService.sendHTMLEmail(to, subject, body, properties);
//		  
//		  contactus.setActive(true);
//		  contactus.setUser(user);
//		  contactusrepo.save(contactus);
//		modelAndView.setViewName("userprofile/contactus");
//		return modelAndView;
//	}

	
	

}
