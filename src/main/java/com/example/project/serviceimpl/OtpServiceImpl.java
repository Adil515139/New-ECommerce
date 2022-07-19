package com.example.project.serviceimpl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.project.service.OtpService;

@Service
public class OtpServiceImpl implements OtpService{

	
	   public String generateOTP(){
	  
			
			  Random random=new Random();
			  
			  String otp = String.format("%04d", random.nextInt(10000));
			 // System.out.println(otp);
			  
			  return otp;
			 
	
	 
}
}