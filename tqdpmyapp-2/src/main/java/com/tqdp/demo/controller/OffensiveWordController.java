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

import com.tqdp.demo.entity.OffenciveWords;
import com.tqdp.demo.service.OffenciveWordsServices;
@RestController
public class OffensiveWordController {
	@Autowired
	private OffenciveWordsServices ser;
	@PostMapping("/addOffenciveWords")
	public OffenciveWords addOffenciveWords(@RequestBody OffenciveWords word) {
		return ser.saveOffenciveWord(word);
	}
	
	@PostMapping("/addOffenciveWord")

	public List<OffenciveWords> addOffenciveWordss(@RequestBody List<OffenciveWords> word) {
		return ser.saveOffenciveWords(word);
	}
	
	@GetMapping("/findOffenciveWords")
	
	public List<OffenciveWords> findAllOffenciveWordss() {
		return ser.getOffenciveWords();
	}
	@GetMapping("/getWords")
	public List<String> findWords() {
		return ser.getAllWords();
	}
	
	@GetMapping("/findOffenciveWord/{id}")
	public OffenciveWords findById(@PathVariable int id) {
		return ser.getOffenciveWord(id);
	}
	
	@PutMapping("/updateOffenciveWord")
	public OffenciveWords updateOffenciveWords(@RequestBody OffenciveWords word) {
		return ser.updateOffenciveWord(word);
	}
	@DeleteMapping("/deleteOffenciveWord/{id}")
	public String deleteOffenciveWords(@PathVariable int id) {
		return ser.deleteOffenciveWord(id);
	}

}
