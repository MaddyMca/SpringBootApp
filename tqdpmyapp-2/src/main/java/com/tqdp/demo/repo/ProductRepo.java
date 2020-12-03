package com.tqdp.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tqdp.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	
}
