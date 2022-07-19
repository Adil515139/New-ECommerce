package com.example.project.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.example.project.model.User;

public interface UserService {
	public void UserSignUp(User user);
	public void userUpdate(User user);
	public User isValidUser(User user);
	
	
	public DataTablesOutput<User> findAll(@Valid DataTablesInput dataTablesInput);

	DataTablesOutput<User> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput);
	public User findById(Long id);
	//public User findById(Long id);
	public void saveUser(User us);
	
	public int totalUser();
	
	public int totalConnectedUser();
	public List<User> getAllUser();

}
