package com.example.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.OrderItem;
import com.example.project.service.OrderItemService;
import com.example.project.util.DaoFactory;


@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	DaoFactory daoFactory;
	
	@Override
	public List<OrderItem> getAllOrderItems() {
		return daoFactory.orderItemRepository.findAll();
	}

}
