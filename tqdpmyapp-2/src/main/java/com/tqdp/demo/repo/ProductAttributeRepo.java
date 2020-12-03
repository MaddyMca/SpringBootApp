package com.tqdp.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqdp.demo.entity.ProductAttribute;

public interface ProductAttributeRepo extends JpaRepository<ProductAttribute, Integer> {

}
