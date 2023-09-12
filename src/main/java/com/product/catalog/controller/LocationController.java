package com.product.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.catalog.models.Location;
import com.product.catalog.services.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LocationController {
	
	@Autowired
	LocationsDao ld;
	
	@GetMapping("/delivery/locations")
	public List<Location> getLocations(){
		return ld.getallLocations();
	}

}
