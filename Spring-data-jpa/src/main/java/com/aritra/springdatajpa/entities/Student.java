package com.aritra.springdatajpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long id;
	private String name;
	public int testScore;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the testScore
	 */
	public int getTestScore() {
		return testScore;
	}

	/**
	 * @param testScore the testScore to set
	 */
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}

}
