package com.dbs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long customerId;
	
	@Column(name="name")
	private String accountHolderName;
	
	@Column(name="overdraft")
	private String overdraft;
	
	@Column(name="clearbalance")
	private double clearBalance;
	
	@Column(name="bic")
	private String bic;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}

	public double getClearBalance() {
		return clearBalance;
	}

	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountHolderName=" + accountHolderName + ", overdraft="
				+ overdraft + ", clearBalance=" + clearBalance + "]";
	}
	
	
	

}
