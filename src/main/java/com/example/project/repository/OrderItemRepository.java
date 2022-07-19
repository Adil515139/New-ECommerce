package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
