package com.example.project.service;

import javax.validation.Valid;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.example.project.model.ContactUs;

@Service
public interface ContactUsService {

	DataTablesOutput<ContactUs> getAllByActiveTrue(@Valid DataTablesInput dataTablesInput);

	DataTablesOutput<ContactUs> findAll(@Valid DataTablesInput dataTablesInput);

	ContactUs findById(Long id);

	int totalContactUsUser();

}
