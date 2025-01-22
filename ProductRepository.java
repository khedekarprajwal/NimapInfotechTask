package com.springboot.Restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Restapi.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	
}
