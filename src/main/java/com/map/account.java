package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class account {

	@Id
	private int accountno;
	@Column(length = 40)
	private String holdername;
	private long amount;
	@Column(length = 40)
	private String branch;
	
	@ManyToOne
	private employee emp;
	
	
	
	
	public employee getEmp() {
		return emp;
	}
	public void setEmp(employee emp) {
		this.emp = emp;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
