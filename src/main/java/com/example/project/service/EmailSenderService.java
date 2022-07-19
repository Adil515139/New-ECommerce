package com.example.project.service;

import com.example.project.model.User;

public interface EmailSenderService {
	
	public void sendMail(User user);
	
	public void sendUpdateMail(User user); 
	
	public void sendForgotPasswordMail( User user);
	
	public void sendThymlifTemplate( User user); 
}
