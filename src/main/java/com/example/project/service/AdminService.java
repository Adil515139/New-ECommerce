package com.example.project.service;

import com.example.project.model.Admin;

public interface AdminService  {
	public boolean processLogin(Admin admin);

	public Admin getAdmin(Admin admin);

	public void updateAdmin(Admin admin);

}
