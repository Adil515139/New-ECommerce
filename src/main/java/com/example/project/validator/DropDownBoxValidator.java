package com.example.project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class DropDownBoxValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
	}
	/*
	 * @Override public boolean supports(Class clazz) {
	 * 
	 * return Product.class.isAssignableFrom(clazz); }
	 * 
	 * @Override public void validate(Object target, Errors errors) { Product
	 * product=(Product) target; ValidationUtils.rejectIfEmptyOrWhitespace(errors,
	 * "supplier", "required.supplier");
	 * 
	 * 
	 * }
	 */

	/*
	 * @Override public boolean supports(Class<?> clazz) { // 
	 * method stub return Supplier.class.isAssignableFrom(clazz);
	 * 
	 * }
	 * 
	 * @Override public void validate(Object target, Errors errors) { //Supplier sup
	 * = (Supplier)target;
	 * 
	 * ValidationUtils.rejectIfEmptyOrWhitespace(errors, "supplier",
	 * "required.supplier");
	 * 
	 * }
	 */

}
