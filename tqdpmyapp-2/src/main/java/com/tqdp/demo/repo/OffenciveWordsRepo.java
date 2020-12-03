package com.tqdp.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqdp.demo.entity.OffenciveWords;

public interface OffenciveWordsRepo  extends JpaRepository<OffenciveWords, Integer>{

}
