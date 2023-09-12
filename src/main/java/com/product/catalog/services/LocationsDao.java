package com.product.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.catalog.models.Location;
import com.product.catalog.repository.LocationRepository;

@Component
public class LocationsDao {
	
	@Autowired
	LocationRepository lr;
	
	public List<Location> getallLocations(){
		return lr.findAll();
	}

}
