package com.tqdp.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tqdp.demo.entity.CatData;

public interface CatRepo extends JpaRepository<CatData,Integer>{
	
}