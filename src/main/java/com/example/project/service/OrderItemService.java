package com.example.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project.model.OrderItem;

@Service
public interface OrderItemService {

	List<OrderItem> getAllOrderItems();

}
