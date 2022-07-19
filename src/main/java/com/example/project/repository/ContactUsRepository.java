package com.example.project.repository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.domain.Specification;

import com.example.project.model.ContactUs;

public interface ContactUsRepository extends DataTablesRepository<ContactUs, Long> {
	List<ContactUs> findAll();
	
	
	DataTablesOutput<ContactUs> findAll(@Valid DataTablesInput dataTablesInput,Specification<ContactUs> specification);
	ContactUs getById(long id);
}
