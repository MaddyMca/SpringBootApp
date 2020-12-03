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

import com.tqdp.demo.entity.CatData;
import com.tqdp.demo.service.CatService;

@RestController
public class CatDataComtroller {
	@Autowired
	private CatService ser;
	@PostMapping("/addCatdata")
	public CatData addCatData(@RequestBody CatData cat) {
		return ser.saveCatData(cat);
	}
	
	@PostMapping("/addCatdatas")

	public List<CatData> addCatDatas(@RequestBody List<CatData> cat) {
		return ser.saveCatDatas(cat);
	}
	
	@GetMapping("/findCatData")
	
	public List<CatData> findAllCatDatas() {
		return ser.getCatDatas();
	}
	
	@GetMapping("/findCatDatas/{id}")
	public CatData findById(@PathVariable int id) {
		return ser.getCatData(id);
	}
	
	@PutMapping("/updateCatdata")
	public CatData updateCatData(@RequestBody CatData cat) {
		return ser.updateCatData(cat);
	}
	@DeleteMapping("/deleteCatData/{id}")
	public String deleteCatdata(@PathVariable int id) {
		return ser.deleteCatData(id);
	}
	
}
