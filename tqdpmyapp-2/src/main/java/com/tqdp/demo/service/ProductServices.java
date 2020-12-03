package com.tqdp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqdp.demo.entity.Product;
import com.tqdp.demo.repo.ProductRepo;

@Service
public class ProductServices {
	@Autowired
	private ProductRepo repo;

	public Product saveProduct(Product product) {
		return repo.save(product);

	}

	public List<Product> saveProducts(List<Product> product) {
		return repo.saveAll(product);

	}

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProduct(int id) {
		return repo.findById(id).orElse(null);
	}

	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "Product removed of id" + id;
	}

	public Product updateProduct(Product product) {
		Product existing = repo.findById(product.getProductId()).orElse(null);
		existing.setName(product.getName());
		existing.setPrice(product.getPrice());
		existing.setCat(product.getCat());
		existing.setDesc(product.getDesc());
		return repo.save(existing);

	}
}
