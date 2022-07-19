package com.example.project.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Admin;
import com.example.project.repository.AdminRepository;
import com.example.project.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;
	
	public boolean processLogin(Admin admin)
	{
		Admin adminFromData = new Admin();
		
		adminFromData = adminRepository.findByEmail(admin.getEmail());
		
		if(adminFromData==null)
		{
			return false;
		}else {
			if(adminFromData.getPassword().equals(admin.getPassword()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
	}

	@Override
	public Admin getAdmin(Admin admin) {
		
		Admin adminGetFromDatabase=adminRepository.findByEmail(admin.getEmail());
		return adminGetFromDatabase;
	}

	@Override
	public void updateAdmin(Admin admin) {
		adminRepository.save(admin);
		
	}

	
}
