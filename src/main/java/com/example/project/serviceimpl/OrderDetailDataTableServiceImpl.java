package com.example.project.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.project.model.OrderDetails;
import com.example.project.service.OrderDetailDataTableService;
import com.example.project.util.DaoFactory;

@Service
public class OrderDetailDataTableServiceImpl   implements OrderDetailDataTableService{
	

	
	
	@Autowired
	DaoFactory daofactory;
	
	
	@Override
	public DataTablesOutput<OrderDetails> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {
		return daofactory.orderDetailsRepository.findAll(dataTablesInput, new Specification<OrderDetails>(){
			
			private static final long serialVersionUID = 1L;

			public Predicate toPredicate(Root<OrderDetails> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				
			
			    Predicate active = criteriaBuilder.equal(root.get("active"),Boolean.TRUE);
				return  criteriaBuilder.and(active);
			}

		
		});
	}

	
	@Override
	public DataTablesOutput<OrderDetails> findAll(@Valid DataTablesInput dataTablesInput) {
		return ((DataTablesOutput<OrderDetails>) daofactory.orderDetailsRepository.findAll(dataTablesInput));
	}
	

	

	
	

	@Override
	public OrderDetails findById(Long id) {
		
		Optional<OrderDetails> orderDetails=daofactory.getOrderDetailsRepository().findById(id);
		
		if(orderDetails.isPresent()) {
			return orderDetails.get();
		}
		return null;
		
		
	}
	
	




	@Override
	public void saveOrder(OrderDetails orderDetails) {
		daofactory.orderDetailsRepository.save(orderDetails);
		
	}



	@Override
	public void updateOrderDetails(OrderDetails orderDetails) {
		daofactory.orderDetailsRepository.save(orderDetails);
		
	}



	@Override
	public int totalPendingOrder() {
		return daofactory.orderDetailsRepository.findOrderByOrderstatus("Pending").size();
	}



	@Override
	public int totalShippedOrder() {
		return daofactory.orderDetailsRepository.findOrderByOrderstatus("Shipped").size();
	}



	@Override
	public int totalCancelledOrder() {
		return daofactory.orderDetailsRepository.findOrderByOrderstatus("Cancelled").size();
	}



	@Override
	public List<OrderDetails> getAllOrderDetails() {
		return (List<OrderDetails>) daofactory.orderDetailsRepository.findAll();
	}











	
	
	
		
		
		
	


	

}
