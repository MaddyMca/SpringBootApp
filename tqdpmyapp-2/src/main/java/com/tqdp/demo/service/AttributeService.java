package com.tqdp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqdp.demo.entity.AttributesMaster;
import com.tqdp.demo.repo.AttributeRepo;
@Service
public class AttributeService {
	@Autowired
	private AttributeRepo repo;

	public AttributesMaster saveAttribute(AttributesMaster att) {
		return repo.save(att);

	}

	public List<AttributesMaster> saveAttributes(List<AttributesMaster> att) {
		return repo.saveAll(att);

	}

	public List<AttributesMaster> getAttributes() {
		return repo.findAll();
	}

	public AttributesMaster getAttribute(int id) {
		return repo.findById(id).orElse(null);
	}

	public String deleteAttribute(int id) {
		repo.deleteById(id);
		return "Catagory removed of id" + id;
	}

	public AttributesMaster updateAttribute(AttributesMaster at) {
		AttributesMaster existingData = repo.findById(at.getAttId()).orElse(null);
		existingData.setName(at.getName());
		return repo.save(existingData);

	}
}
