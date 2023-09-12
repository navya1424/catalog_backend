package com.product.catalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.catalog.models.Customer;
import com.product.catalog.repository.CustomerRepository;


@Component
public class CustomerDao {
	
	@Autowired
	CustomerRepository cr;
	
	public boolean validateCustomerUsingEmailPassword(String username,String password) {
		if(cr.validateCustomer(username, password)!=null) {
			return true;
		}
		return false;
	}
	
	public Customer addCustomer(Customer c) {
		cr.save(c);
		System.out.println("Customer added");
		return c;
	}
	
	public boolean customerAlreadyPresent(String email) {
		if(cr.findById(email).isPresent()) {
			return true;
		}
		System.out.println("Customer record already exists");
		return false;
	}

}
