package com.example.project.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Cart;

@Repository
public interface CartPaggingRepository extends PagingAndSortingRepository<Cart, Long>{

}
