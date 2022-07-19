package com.example.project.serviceimpl;

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
import com.example.project.service.PendingOrderService;
import com.example.project.util.DaoFactory;

@Service
public class PendingOrderServiceImpl implements PendingOrderService {
	
	
	@Autowired
	DaoFactory daoFactory;
	
	@Override
	public DataTablesOutput<OrderDetails> getAllByOrderstatus(@Valid DataTablesInput dataTablesInput) {
			return daoFactory.orderDetailsRepository.findAll(dataTablesInput, new Specification<OrderDetails>(){
			
			private static final long serialVersionUID = 1L;

			public Predicate toPredicate(Root<OrderDetails> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				
			
			    Predicate orderstatus = criteriaBuilder.equal(root.get("orderstatus"),"Pending");
				return  criteriaBuilder.and(orderstatus);
			}

		
		});
	}
	


	@Override
	public DataTablesOutput<OrderDetails> findAll(@Valid DataTablesInput dataTablesInput) {
	
		
		return ((DataTablesOutput<OrderDetails>) daoFactory.orderDetailsRepository.findAll(dataTablesInput));
	}
	

}
