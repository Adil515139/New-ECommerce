package com.example.project.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.example.project.model.OrderDetails;

public interface OrderDetailDataTableService {

	//DataTablesOutput<OrderDetails> getAllOrder(@Valid DataTablesInput dataTablesInput);

	//DataTablesOutput<OrderDetails> getAllByactive(@Valid DataTablesInput dataTablesInput);

	public DataTablesOutput<OrderDetails> findAll(@Valid DataTablesInput dataTablesInput);

	DataTablesOutput<OrderDetails> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput);
	


	OrderDetails findById(Long id);



	public void saveOrder(OrderDetails orderDetails);

	public void updateOrderDetails(OrderDetails orderDetails);

	int totalPendingOrder();

	int totalShippedOrder();

	int totalCancelledOrder();

	public List<OrderDetails> getAllOrderDetails();


	
	
	
	
	

}
