package com.product.catalog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.catalog.models.Product;
import com.product.catalog.repository.ProductRepository;

@Component
public class ProductDao {
	
	@Autowired
	ProductRepository pr;
	
	public void saveProduct(Product p) {
		pr.save(p);
		System.out.println("Product saved");
	}
	
	public Optional<Product> getProductDetails(int id) {
		Optional<Product> p=pr.findById(id);
		return p;
	}
	
	public List<Product> getProductsByType(String type){
		return pr.getproductusingtype(type);
	}
	
	public List<Product> fetchAllProducts(){
		return pr.findAll();
	}

}
