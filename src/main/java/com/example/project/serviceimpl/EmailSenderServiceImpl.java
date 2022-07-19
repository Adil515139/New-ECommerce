package com.example.project.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.example.project.model.User;
import com.example.project.service.EmailSenderService;




@Service
public class EmailSenderServiceImpl implements EmailSenderService{

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	ThymeleafAutoConfiguration thymeleafAutoConfiguration;
	
	@Autowired
	SpringTemplateEngine springTemplateEngine;
	

	public void sendMail(@ModelAttribute User user) {
		final   String toEmail=user.getEmail();
		final	String subject="vgfaafk";
		final	String message="vfchgdevjfbedf";
		
		System.out.println("mail send");
		
		javaMailSender.send(new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
		
				MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true,"UTF-8");
				helper.setTo(toEmail);
				helper.setText(message,true);
				helper.setSubject(subject);
				
				
				
			}
		});
		
	}
	
	
	public void sendUpdateMail(@ModelAttribute User user) {
		final   String toEmail=user.getEmail();
		final	String subject="Update Profile";
		final	String message="your Email is Updated";
		
		System.out.println("mail send");
		
		javaMailSender.send(new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
		
				MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true,"UTF-8");
				helper.setTo(toEmail);
				helper.setText(message,true);
				helper.setSubject(subject);
				
			}
		});
		
	}
	public void sendForgotPasswordMail(@ModelAttribute User user) {
		   String toEmail=user.getEmail();
			String subject="Please Verify Your Change Password";
		String messages="<p>Dear" +user.getEmail()+",<p>";
		String messagess="<p> Please click the link  below to verify  to your registration:</p>";
		String messagesss="....Please Click Link \n http://localhost:8090/eCommerce/adminlogin ";
		
		System.out.println("mail send");
		
		javaMailSender.send(new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
		
				MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true,"UTF-8");
				helper.setTo(toEmail);
				helper.setText(messages, true);
				helper.setText(messagess, true);
				helper.setText(messagesss, true);
				helper.setSubject(subject);
				
			}
		});
		
	}
	/*
	 * public void sendOTPEmail() {
	 * 
	 * SimpleMailMessage email=new SimpleMailMessage();
	 * 
	 * javaMailSender.send(email);
	 * 
	 * 
	 * }
	 */
	
	public void sendThymlifTemplate(@ModelAttribute User user) {
		
		  Map<String, Object> properties=new HashMap<>();
		  
		  
		  properties.put("user", user);
		 
		   String toEmail=user.getEmail();
			String subject=" E-Commerce's Customer";
		
		String bodyTemplate = "successtemplate.html";
		
		System.out.println("mail send");
		
		javaMailSender.send(new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
		
			
				
				MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true,"UTF-8");
				/* helper.addAttachment("logo", new ClassPathResource("download.png")); */
				helper.setTo(toEmail);
	
				
				helper.setSubject(subject);
			  
				Context context=new Context();
			
				context.setVariables(properties);

				String html = springTemplateEngine.process(bodyTemplate, context);
				helper.setText(html, true);
				
				
				
				
				
		        
		        
		       
			}
		});
		
	}
	
//	public void sendHTMLEmail(String to, String subject, String bodyTemplate, Map<String, Object> properties) throws MessagingException {
//		   
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        
//        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
//   
//        mimemessagehelper.setfrom("nishilpjpt@gmail.com");
//        mimeMessageHelper.setTo(to);
//		mimeMessageHelper.setSubject(subject);
//		
//        Context context = new Context();
////        properties.put("name", "Nishil Prajapati");
////        properties.put("date", LocalDate.now().toString());
//        context.setVariables(properties);
//        
//		String html = springTemplateEngine.process(bodyTemplate, context);
//        mimeMessageHelper.setText(html, true);
//        
//        
//        mailSender.send(mimeMessage);
//        
//        System.err.println("Mail Sent Successfully !!");
//    }
	 
	
		
	
}
