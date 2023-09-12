package com.product.catalog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.catalog.models.Customer;
import com.product.catalog.models.Person;
import com.product.catalog.services.CustomerDao;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerDao cdao;
	
	@PostMapping("/validatecustomer")
	public boolean validateuser(@RequestBody Person p, HttpSession session) {
		System.out.println(p.getEmail() +" "+ p.getPassword());
		boolean islogin = cdao.validateCustomerUsingEmailPassword(p.getEmail(), p.getPassword());
		return islogin;
		
	}
	
	@PostMapping("/registercustomer")
	public boolean registercustomer(@RequestBody Customer c) {
		if(!cdao.customerAlreadyPresent(c.getCustomer_email())) {
			cdao.addCustomer(c);
			return true;
		}
		return false;
		
	}

		

}
