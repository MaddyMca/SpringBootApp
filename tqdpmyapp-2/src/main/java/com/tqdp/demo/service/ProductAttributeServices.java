package com.tqdp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqdp.demo.entity.ProductAttribute;
import com.tqdp.demo.repo.ProductAttributeRepo;

@Service
public class ProductAttributeServices {
	@Autowired
	private ProductAttributeRepo repo;

	public ProductAttribute saveProductAttr(ProductAttribute productAttr) {
		return repo.save(productAttr);

	}

	public List<ProductAttribute> saveProductAttrs(List<ProductAttribute> productAttr) {
		return repo.saveAll(productAttr);

	}

	public List<ProductAttribute> getProductAttrs() {
		return repo.findAll();
	}

	public ProductAttribute getProductAttr(int id) {
		return repo.findById(id).orElse(null);
	}

	public String deleteProductAttr(int id) {
		repo.deleteById(id);
		return "Product removed of id" + id;
	}

	public ProductAttribute updateProductAttr(ProductAttribute productAttr) {
		ProductAttribute existing = repo.findById(productAttr.getId()).orElse(null);
		existing.setValue(productAttr.getValue());
		return repo.save(existing);

	}

}
