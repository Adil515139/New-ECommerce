package com.example.project.service;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.example.project.model.OrderDetails;

@Service
public interface CancelledOrderService {

	
	public DataTablesOutput<OrderDetails> findAll(@Valid DataTablesInput dataTablesInput);

	DataTablesOutput<OrderDetails> getAllByOrderstatus(@Valid DataTablesInput dataTablesInput);

}
