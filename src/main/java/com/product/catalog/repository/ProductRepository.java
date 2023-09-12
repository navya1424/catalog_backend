package com.product.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.catalog.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("from Product where productType=?1 or productBrand=?1 or productColour=?1")
	List<Product> getproductusingtype(String type);

}
