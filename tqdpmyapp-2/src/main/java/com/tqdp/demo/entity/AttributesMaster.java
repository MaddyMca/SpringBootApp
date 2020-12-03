package com.tqdp.demo.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class AttributesMaster implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attId;
	private String name;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "AttributeCatMaster",
		joinColumns = { @JoinColumn(name = "AttributeId")},
		inverseJoinColumns = { @JoinColumn (name = "CatId")})
	private Set<CatData> catagory= new HashSet<>();
	public AttributesMaster() {
		super();
	}
	public int getAttId() {
		return attId;
	}
	public void setAttId(int attId) {
		this.attId = attId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<CatData> getCatagory() {
		return catagory;
	}
	public void setCatagory(Set<CatData> atts) {
		this.catagory = atts;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AttributesMster [attId=" + attId + ", name=" + name + ", catagory=" + catagory + "]";
	}
	public AttributesMaster(int attId, String name, Set<CatData> atts) {
		super();
		this.attId = attId;
		this.name = name;
		this.catagory = atts;
	}
	

}

	
