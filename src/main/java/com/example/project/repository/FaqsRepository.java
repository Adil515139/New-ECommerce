package com.example.project.repository;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.domain.Specification;

import com.example.project.model.Faqs;

public interface FaqsRepository extends DataTablesRepository<Faqs, Long> {

	DataTablesOutput<Faqs> findAll(@Valid DataTablesInput dataTablesInput,Specification<Faqs> specification);

	Faqs getById(Long id);

}
