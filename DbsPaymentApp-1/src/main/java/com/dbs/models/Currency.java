package com.dbs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currency")
public class Currency {
	@Id
	private String currencyCode;
	
	
	
	@Column(name="value")
	private double currencyValue;

	public Currency() {
		
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	

	
	

	public double getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(double currencyValue) {
		this.currencyValue = currencyValue;
	}

	public Currency(String currencyCode,double currencyValue) {
		
		this.currencyCode = currencyCode;
		
		this.currencyValue = currencyValue;
	}
	
	
	

}
