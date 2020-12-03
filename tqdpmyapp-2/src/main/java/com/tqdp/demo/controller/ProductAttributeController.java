package com.tqdp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tqdp.demo.entity.ProductAttribute;
import com.tqdp.demo.service.ProductAttributeServices;

@RestController
public class ProductAttributeController {
	@Autowired
	private ProductAttributeServices ser;

	@PostMapping("/addProductAttr")
	public ProductAttribute addProduct(@RequestBody ProductAttribute product) {

		return ser.saveProductAttr(product);
	}

	@PostMapping("/addProductAttrs")

	public List<ProductAttribute> addProductAttrs(@RequestBody List<ProductAttribute> product) {
		return ser.saveProductAttrs(product);
	}

	@GetMapping("/findProductAttrs")

	public List<ProductAttribute> findProducts() {
		return ser.getProductAttrs();
	}

	@GetMapping("/findProductAttr/{id}")
	public ProductAttribute findByProductId(@PathVariable int id) {
		return ser.getProductAttr(id);
	}

	@PutMapping("/updateProductAttr")
	public ProductAttribute updateProduct(@RequestBody ProductAttribute product) {
		return ser.updateProductAttr(product);
	}

	@DeleteMapping("/deleteProductAttr/{id}")
	public String deleteProduct(@PathVariable int id) {
		return ser.deleteProductAttr(id);
	}

}
