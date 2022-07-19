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

import com.example.project.model.ContactUs;
import com.example.project.service.ContactUsService;
import com.example.project.util.DaoFactory;

@Service
public class ContactUsServiceImpl implements ContactUsService{

	@Autowired
	DaoFactory daofactory;

	@Override
	public DataTablesOutput<ContactUs> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput) {
		return daofactory.contactUsRepository.findAll(dataTablesInput, new Specification<ContactUs>(){
			
			private static final long serialVersionUID = 1L;

			public Predicate toPredicate(Root<ContactUs> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				
			
			    Predicate active = criteriaBuilder.equal(root.get("active"),Boolean.TRUE);
				return  criteriaBuilder.and(active);
			}

		
		});
	}



	@Override
	public DataTablesOutput<ContactUs> findAll(@Valid DataTablesInput dataTablesInput) {
		return ((DataTablesOutput<ContactUs>) daofactory.contactUsRepository.findAll(dataTablesInput));
	}



	@Override
	public ContactUs findById(Long id) {
			Optional<ContactUs> contactusDetails=daofactory.getContactUsRepository().findById(id);
		
		if(contactusDetails.isPresent()) {
			return contactusDetails.get();
		}
		return null;
	}



	@Override
	public int totalContactUsUser() {
		return daofactory.contactUsRepository.findAll().size();
	}
	

}
