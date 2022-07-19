//
//  package com.example.project.config;
//  
//  import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import  org.springframework.context.annotation.Configuration;
//import org.springframework.mail.javamail.JavaMailSender;
//import  org.springframework.mail.javamail.JavaMailSenderImpl;
// 
//  
//  @Configuration 
//  public class MailConfig {
//  
//  @Value("smtp.gmail.com")
//  private String host;
//  
//  @Value("500")
//  private int port;
//  
//  @Bean private JavaMailSender javaMailService() { 
//	  JavaMailSenderImpl javaMailSender=new JavaMailSenderImpl();
//	  javaMailSender.setHost(host);
//	  javaMailSender.setPort(port);
//	  javaMailSender.setUsername("adil515139@mail.com");
//	  javaMailSender.setPassword("password");
//	return javaMailSender;
//  
//  
//  }
//  
//  
//  }
// 