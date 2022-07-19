package com.example.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Cart;
import com.example.project.repository.CartPaggingRepository;
import com.example.project.service.CartService;
import com.example.project.util.DaoFactory;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartPaggingRepository cartPaggingRepository;
	
	@Autowired
	public DaoFactory daoFactory;
	
	@Override
	public List<Cart> getAllCart(int pageNo, int pageSize, String sortBy) {
		 Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by("id").ascending());
				  
				  Page<Cart> pagedResult = cartPaggingRepository.findAll(paging);
				  
				  
				  
				  if(pagedResult.hasContent()) {
					  return pagedResult.getContent();
				  }
				  else{
				  return new ArrayList<Cart>();
				  
				  } 

	
	}

	@Override
	public Cart findById(Long id) {

		return daoFactory.cartRepository.getById(id);
	}

	@Override
	public List<Cart> getAllCarts() {
		return daoFactory.cartRepository.findAll();
	}
}
