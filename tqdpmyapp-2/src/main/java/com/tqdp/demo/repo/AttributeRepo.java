package com.tqdp.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tqdp.demo.entity.AttributesMaster;

public interface AttributeRepo  extends JpaRepository<AttributesMaster,Integer>{

}
