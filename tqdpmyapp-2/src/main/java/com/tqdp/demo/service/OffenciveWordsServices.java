package com.tqdp.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tqdp.demo.entity.OffenciveWords;
import com.tqdp.demo.repo.OffenciveWordsRepo;

@RestController
public class OffenciveWordsServices {
	@Autowired
	private OffenciveWordsRepo repo;
	public OffenciveWords saveOffenciveWord(OffenciveWords words) {
		return repo.save(words);
		
	}
	public List<OffenciveWords> saveOffenciveWords(List<OffenciveWords> words) {
		return repo.saveAll(words);
		
	}
	public List<OffenciveWords> getOffenciveWords() {
		return repo.findAll();		
	}
	public OffenciveWords getOffenciveWord(int id) {
		return repo.findById(id).orElse(null);	
	}
	public String deleteOffenciveWord(int id) {
		repo.deleteById(id);
		return "word removed of id"+id;
	}
	public OffenciveWords updateOffenciveWord(OffenciveWords words) {
		OffenciveWords existingData=repo.findById(words.getId()).orElse(null);
		existingData.setOffensiveWord(words.getOffensiveWord());
		return repo.save(existingData);
		
	}
	public List<String> getAllWords(){
		List<String> words=new ArrayList<>();
		List<OffenciveWords> fw=repo.findAll();
		for(OffenciveWords i:fw)
			words.add(i.getOffensiveWord());
		return words;
	}

}
