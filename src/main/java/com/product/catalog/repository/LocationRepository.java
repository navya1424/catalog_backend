package com.product.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.product.catalog.models.Location;

@Component
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
