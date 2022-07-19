package com.example.project.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Product;
import com.example.project.repository.ProductsPaggingRepository;
import com.example.project.service.ProductService;
import com.example.project.util.DaoFactory;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	private DaoFactory daoFactory;
	
	  @Autowired 
	  private ProductsPaggingRepository productsPaggingRepository;
	  
	  
	  public List<Product> getAllProducts(int pageNo, int pageSize, String sortBy)
	  {
	  
	  Pageable paging = PageRequest.of(pageNo, pageSize,
	  Sort.by("id").ascending());
	  
	  Page<Product> pagedResult = productsPaggingRepository.findAll(paging);
	  
	  if(pagedResult.hasContent()) {
		  return pagedResult.getContent();
	  }
	  else{
	  return new ArrayList<Product>();
	  
	  } 
	  }
	 
	  
	  
	


		@Override
		public void addProduct(Product product) {
			daoFactory.productRepository.save(product);
			
		}






		@Override
		public List<Product> getAllProduct() {
			List<Product> products=daoFactory.productRepository.findAll();
			return products;
		}



		@Override
		public Product findById(Long id) {
			Optional<Product> productDetails=daoFactory.getProductRepository().findById(id);
			
			if(productDetails.isPresent()) {
				return productDetails.get();
			}
			return null;
		}



		@Override
		public Product getById(Long id) {
			Product productFromDatabase=daoFactory.productRepository.getById(id);
			return productFromDatabase;
		}



		@Override
		public void saveProduct(Product product) {
			daoFactory.productRepository.save(product);
			
		}



		@Override
		public void updateProduct(Product product) {
			
			daoFactory.productRepository.save(product);
			
		}






		@Override
		public int totalProductAvailable() {
			// TODO Auto-generated method stub
			return daoFactory.productRepository.findAll().size();
		}



		/*
		 * @Override public List<Product> getAllProductById(Long id) { List<Product>
		 * products= (List<Product>) daoFactory.productRepository.getById(id); return
		 * products; }
		 */
		
	
	  
}
