package com.tqdp.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tqdp.demo.entity.Product;
import com.tqdp.demo.service.ProductServices;

@RestController

public class ProductContoller {
	@Autowired
	private ProductServices ser;
	@PostMapping("/addProduct")
	public Product addProduct(@Valid @RequestBody Product product ) {
		
		return ser.saveProduct(product);
	}

	@PostMapping("/addProducts")

	public List<Product> addProducts(@RequestBody List<Product> product) {
		return ser.saveProducts(product);
	}

	@GetMapping("/findProducts")

	public List<Product> findProducts() {
		return ser.getProducts();
	}

	@GetMapping("/findProduct/{id}")
	public Product findByProductId(@PathVariable int id) {
		return ser.getProduct(id);
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@Valid @RequestBody Product product) {
		return ser.updateProduct(product);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return ser.deleteProduct(id);
	}

}
