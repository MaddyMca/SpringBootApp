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

import com.tqdp.demo.entity.AttributesMaster;
import com.tqdp.demo.service.AttributeService;
@RestController
public class AttributeController {
	@Autowired
	private AttributeService ser;
	@PostMapping("/addAttribute")
	public AttributesMaster addatt(@RequestBody AttributesMaster att ) {
		
		return ser.saveAttribute(att);
	}

	@PostMapping("/addAttributes")

	public List<AttributesMaster> addatts(@RequestBody List<AttributesMaster> att) {
		return ser.saveAttributes(att);
	}

	@GetMapping("/findAttributes")

	public List<AttributesMaster> findatts() {
		return ser.getAttributes();
	}

	@GetMapping("/findAttribute/{id}")
	public AttributesMaster findByattId(@PathVariable int id) {
		return ser.getAttribute(id);
	}

	@PutMapping("/updateAttribute")
	public AttributesMaster updateatt(@RequestBody AttributesMaster att) {
		return ser.updateAttribute(att);
	}

	@DeleteMapping("/deleteAttribute/{id}")
	public String deleteatt(@PathVariable int id) {
		return ser.deleteAttribute(id);
	}
}
