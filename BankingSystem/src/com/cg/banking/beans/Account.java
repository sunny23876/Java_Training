package com.cg.banking.beans;

public class Account {
private int accountNo,accountBalance ;
private String accountType;
private Transaction transaction;

public Account(){}

public Account(int accountNo, int accountBalance, String accountType, Transaction transaction) {
	super();
	this.accountNo = accountNo;
	this.accountBalance = accountBalance;
	this.accountType = accountType;
	this.transaction = transaction;
}

public int getAccountNo() {
	return accountNo;
}

public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}

public int getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(int accountBalance) {
	this.accountBalance = accountBalance;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public Transaction getTransaction() {
	return transaction;
}

public void setTransaction(Transaction transaction) {
	this.transaction = transaction;
}





}
