package com.example.project.service;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.example.project.model.Faqs;

@Service
public interface FaqsService {

	DataTablesOutput<Faqs> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput);

	DataTablesOutput<Faqs> findAll(@Valid DataTablesInput dataTablesInput);

	public Faqs getById(Long id);

	void saveFAQS(Faqs faqs);

	Faqs findById(Long id);

}
