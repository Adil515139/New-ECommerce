package com.example.project.serviceimpl;

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

import com.example.project.model.Faqs;
import com.example.project.service.FaqsService;
import com.example.project.util.DaoFactory;

@Service
public class FaqsServiceImpl  implements FaqsService{
	
	@Autowired
	DaoFactory daoFactory;

	@Override
	public DataTablesOutput<Faqs> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {
		return daoFactory.faqsRepository.findAll(dataTablesInput, new Specification<Faqs>(){
			
			private static final long serialVersionUID = 1L;

			public Predicate toPredicate(Root<Faqs> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				
			
			    Predicate active = criteriaBuilder.equal(root.get("active"),Boolean.TRUE);
				return  criteriaBuilder.and(active);
			}

		
		});
	}



	@Override
	public DataTablesOutput<Faqs> findAll(@Valid DataTablesInput dataTablesInput) {
		return ((DataTablesOutput<Faqs>) daoFactory.faqsRepository.findAll(dataTablesInput));
	}



	@Override
	public Faqs getById(Long id) {
		Faqs faqsFromDatabase=daoFactory.faqsRepository.getById(id);
		return faqsFromDatabase;
	}



	@Override
	public void saveFAQS(Faqs faqs) {
		daoFactory.faqsRepository.save(faqs);
		
	}



	@Override
	public Faqs findById(Long id) {
		
Optional<Faqs> faqs=daoFactory.faqsRepository.findById(id);
		
		if(faqs.isPresent()) {
			return faqs.get();
		}
		return null;
	}
	


}
