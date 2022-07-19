package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.project.model.Address;


@Service
public interface AddressService {

	Address findById(long id);

	List<Address> getAllAddress();

}
