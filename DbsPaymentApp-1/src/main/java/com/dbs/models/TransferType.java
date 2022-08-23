package com.dbs.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transfer_type")
public class TransferType {
	@Id
	private String transferType;
	

	public TransferType() {
		
	}
	

	public TransferType(String transferType) {
		this.transferType = transferType;
	}


	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	

}
