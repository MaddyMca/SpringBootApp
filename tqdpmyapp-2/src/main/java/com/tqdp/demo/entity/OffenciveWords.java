package com.tqdp.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OffenciveWords implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String offensiveWord;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOffensiveWord() {
		return offensiveWord;
	}

	public void setOffensiveWord(String offensiveWord) {
		this.offensiveWord = offensiveWord;
	}

	@Override
	public String toString() {
		return "OffenciveWords [id=" + id + ", offensiveWord=" + offensiveWord + "]";
	}

	public OffenciveWords(int id, String offensiveWord) {
		super();
		this.id = id;
		this.offensiveWord = offensiveWord;
	}

	public OffenciveWords() {
		super();
	}

}
