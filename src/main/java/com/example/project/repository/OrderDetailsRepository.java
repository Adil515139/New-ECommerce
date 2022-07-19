
  package com.example.project.repository;
  
  import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.model.OrderDetails;
  
@Repository
  public interface OrderDetailsRepository extends DataTablesRepository<OrderDetails, Long>{



	List<OrderDetails> findOrderByOrderstatus(String orderstatus);


	
	
	DataTablesOutput<OrderDetails> findAll(@Valid DataTablesInput dataTablesInput,Specification<OrderDetails> specification);
	
	@Query(value="SELECT o.order_status from order_details o where o.id=:id", nativeQuery = true)
	String GetOrderStatusById(@Param("id") Long id);

	@Query(value="SELECT o.* from order_details o where o.id=:id", nativeQuery = true)
	OrderDetails GetProductByOrderId(Long id);





	





	



	
	


  }
 