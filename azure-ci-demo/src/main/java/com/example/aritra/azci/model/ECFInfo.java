package com.example.aritra.azci.model;

import java.util.Date;

public class ECFInfo {
	
	private String fullName;
	private Date estd;
	
	
	public ECFInfo(String fullName, Date estd) {
		super();
		this.fullName = fullName;
		this.estd = estd;
	}
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the estd
	 */
	public Date getEstd() {
		return estd;
	}
	/**
	 * @param estd the estd to set
	 */
	public void setEstd(Date estd) {
		this.estd = estd;
	}
	
	

}
