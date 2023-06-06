package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
@Column(length = 30)
	private String name;
@Column(length = 40)
	private String address;
@Column(length = 20)
	private String city;

@OneToMany(mappedBy = "emp")
private List<account> acc;




public List<account> getAcc() {
	return acc;
}
public void setAcc(List<account> acc) {
	this.acc = acc;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
	
	
	
	
}
