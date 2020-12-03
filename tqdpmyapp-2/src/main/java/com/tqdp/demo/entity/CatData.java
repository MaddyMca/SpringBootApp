package com.tqdp.demo.entity;


import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.sun.istack.NotNull;

@Entity
public class CatData implements Serializable {
	/*
	 * 
	 */
	private static final long serialVersionUID = -5816306740789972947L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int catId;
	@NotNull
	private String catName;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "AttrinuteCatMaster",
		joinColumns = { @JoinColumn(name = "CatId")},
		inverseJoinColumns = { @JoinColumn (name = "AttributeId")})
	private Set<AttributesMaster> atts= new HashSet<AttributesMaster>();
	
	
	@Override
	public String toString() {
		return "CatData [catId=" + catId + ", catName=" + catName + ", atts=" + atts + "]";
	}


	public CatData(int catId, String catName, Set<AttributesMaster> atts) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.atts = atts;
	}


	public int getCatId() {
		return catId;
	}


	public void setCatId(int catId) {
		this.catId = catId;
	}


	public String getCatName() {
		return catName;
	}


	public void setCatName(String catName) {
		this.catName = catName;
	}


	public Set<AttributesMaster> getAtts() {
		return atts;
	}


	public void setAtts(Set<AttributesMaster> atts) {
		this.atts = atts;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public CatData() {

	}

}
