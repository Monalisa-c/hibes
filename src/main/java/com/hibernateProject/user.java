package com.hibernateProject;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="user_details")
public class user {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(name="uname",length = 30)
	private String name;
	
	@Column(name="ucountry",length = 30)
	private String country;
	
	
	@Transient
	private double a;
	
	Certificate certificate;
	
	

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(int uid, String name, String country) {
		super();
		this.uid = uid;
		this.name = name;
		this.country = country;
		
	}

	

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public int getId() {
		return uid;
	}

	public void setId(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
