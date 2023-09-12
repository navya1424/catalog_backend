package com.product.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.catalog.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
	
	@Query("from Customer where customer_email=?1 and customer_password=?2")
	Customer validateCustomer(String username,String password);

}
