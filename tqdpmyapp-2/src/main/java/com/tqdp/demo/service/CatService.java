package com.tqdp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqdp.demo.entity.CatData;
import com.tqdp.demo.repo.CatRepo;

@Service
public class CatService {
	@Autowired
	private CatRepo repo;
	public CatData saveCatData(CatData cat) {
		return repo.save(cat);
		
	}
	public List<CatData> saveCatDatas(List<CatData> cat) {
		return repo.saveAll(cat);
		
	}
	public List<CatData> getCatDatas() {
		return repo.findAll();		
	}
	public CatData getCatData(int id) {
		return repo.findById(id).orElse(null);	
	}
	public String deleteCatData(int id) {
		repo.deleteById(id);
		return "Catagory removed of id"+id;
	}
	public CatData updateCatData(CatData cat) {
		CatData existingData=repo.findById(cat.getCatId()).orElse(null);
		existingData.setCatName(cat.getCatName());
		return repo.save(existingData);
		
	}
	
	
}
