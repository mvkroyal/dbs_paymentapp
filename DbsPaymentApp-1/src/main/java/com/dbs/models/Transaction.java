package com.dbs.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long transactionId;
	
	@ManyToOne
    @JoinColumn(name="customerid")
    private Customer customer;
	
	@ManyToOne
    @JoinColumn(name="currencyCode")
    private Currency currency;
	
	
	@ManyToOne
	@JoinColumn(name="bic")
	private Bank recievrerbic;
	
	private String receiverAccountHolderNumber;
    private String receiverAccountHolderName;
    
    @ManyToOne
    @JoinColumn(name="transfer_type")
    private TransferType transfertype;
    
    @ManyToOne
    @JoinColumn(name="messageCode")
    private Message message ;
    
    private double currencyamount;
    
    private double transferfees;
    
    private double inramount;
    
    private LocalDate transferdate;

	public Transaction() {
		
	}

	public Transaction(long transactionId, Customer customer, Currency currency, Bank recievrerbic,
			String receiverAccountHolderNumber, String receiverAccountHolderName, TransferType transfertype,
			Message message, double currencyamount, double transferfees, double inramount, LocalDate transferdate) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.currency = currency;
		this.recievrerbic = recievrerbic;
		this.receiverAccountHolderNumber = receiverAccountHolderNumber;
		this.receiverAccountHolderName = receiverAccountHolderName;
		this.transfertype = transfertype;
		this.message = message;
		this.currencyamount = currencyamount;
		this.transferfees = transferfees;
		this.inramount = inramount;
		this.transferdate = transferdate;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Bank getRecievrerbic() {
		return recievrerbic;
	}

	public void setRecievrerbic(Bank recievrerbic) {
		this.recievrerbic = recievrerbic;
	}

	public String getReceiverAccountHolderNumber() {
		return receiverAccountHolderNumber;
	}

	public void setReceiverAccountHolderNumber(String receiverAccountHolderNumber) {
		this.receiverAccountHolderNumber = receiverAccountHolderNumber;
	}

	public String getReceiverAccountHolderName() {
		return receiverAccountHolderName;
	}

	public void setReceiverAccountHolderName(String receiverAccountHolderName) {
		this.receiverAccountHolderName = receiverAccountHolderName;
	}

	public TransferType getTransfertype() {
		return transfertype;
	}

	public void setTransfertype(TransferType transfertype) {
		this.transfertype = transfertype;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public double getCurrencyamount() {
		return currencyamount;
	}

	public void setCurrencyamount(double currencyamount) {
		this.currencyamount = currencyamount;
	}

	public double getTransferfees() {
		return transferfees;
	}

	public void setTransferfees(double transferfees) {
		this.transferfees = transferfees;
	}

	public double getInramount() {
		return inramount;
	}

	public void setInramount(double inramount) {
		this.inramount = inramount;
	}

	public LocalDate getTransferdate() {
		return transferdate;
	}

	public void setTransferdate(LocalDate transferdate) {
		this.transferdate = transferdate;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customer=" + customer + ", currency=" + currency
				+ ", recievrerbic=" + recievrerbic + ", receiverAccountHolderNumber=" + receiverAccountHolderNumber
				+ ", receiverAccountHolderName=" + receiverAccountHolderName + ", transfertype=" + transfertype
				+ ", message=" + message + ", currencyamount=" + currencyamount + ", transferfees=" + transferfees
				+ ", inramount=" + inramount + ", transferdate=" + transferdate + "]";
	}
	
    

}
