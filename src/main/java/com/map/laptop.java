package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laptop_details")
public class laptop {
@Id
	private int lid;
	private String lname;
	private String model;
	public int getLid() {
		return lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
	
	
}
