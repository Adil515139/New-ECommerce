package com.example.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Supplier;
import com.example.project.service.SupplierService;
import com.example.project.util.DaoFactory;


@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	DaoFactory daoFactory;
	
	@Override
	public List<Supplier> getALLSupplier() {
		List<Supplier> supplier=daoFactory.supplierRepository.findAll();
 		return supplier;
	}

}
