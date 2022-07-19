package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.model.Supplier;

@Service
public interface SupplierService {

	List<Supplier> getALLSupplier();

}
