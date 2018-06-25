package com.cg.banking.beans;

public class Transaction {
	private int transactionId,  amount ;
	private String timeStamp, transactionType, transactionLocation, modeOfTransation, transactionStatus;
    
	public Transaction(){}

	public Transaction(int transactionId, int amount, String timeStamp, String transactionType,
			String transactionLocation, String modeOfTransation, String transactionStatus) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.timeStamp = timeStamp;
		this.transactionType = transactionType;
		this.transactionLocation = transactionLocation;
		this.modeOfTransation = modeOfTransation;
		this.transactionStatus = transactionStatus;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionLocation() {
		return transactionLocation;
	}

	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}

	public String getModeOfTransation() {
		return modeOfTransation;
	}

	public void setModeOfTransation(String modeOfTransation) {
		this.modeOfTransation = modeOfTransation;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	
}
