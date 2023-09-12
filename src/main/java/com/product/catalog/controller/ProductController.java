package com.product.catalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.catalog.models.Product;
import com.product.catalog.services.ProductDao;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
	@Autowired
	ProductDao pd;
	
	@PostMapping("/addProduct")
	public void saveProduct(Product p) {
		pd.saveProduct(p);
	}
	
	@GetMapping("/product/productdetails/{id}")
	public Optional<Product> getProductDesc(@PathVariable("id") String id) {
		int pid=Integer.parseInt(id);
		return pd.getProductDetails(pid);
		
	}
	
	@GetMapping("/product/producttype/{type}")
	public List<Product> getProductByType(@PathVariable("type") String type){
		return pd.getProductsByType(type);
	}
	
	@GetMapping("/product/allproducts")
	public List<Product> getAllProducts(){
		return pd.fetchAllProducts();
	}


}
