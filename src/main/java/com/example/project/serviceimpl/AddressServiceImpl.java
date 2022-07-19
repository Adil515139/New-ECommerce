package com.example.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Address;
import com.example.project.service.AddressService;
import com.example.project.util.DaoFactory;


@Service
public class AddressServiceImpl implements AddressService {
	
	
	@Autowired
	public DaoFactory daoFactory;

	@Override
	public Address findById(long id) {
		return daoFactory.addressRepository.getById(id);
	}

	@Override
	public List<Address> getAllAddress() {
		return daoFactory.addressRepository.findAll();
	}

	

}
