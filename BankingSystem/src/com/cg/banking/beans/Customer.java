package com.cg.banking.beans;

public class Customer {

private int	customerId;
private String firstName,lastName,mobileNo,emailId,adharNo,pancardNo,dateOfBirth;
private Address address;
private Account account;

public Customer(){}

public Customer(int customerId, String firstName, String lastName, String mobileNo, String emailId, String adharNo,
		String pancardNo, String dateOfBirth, Address address, Account account) {
	super();
	this.customerId = customerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNo = mobileNo;
	this.emailId = emailId;
	this.adharNo = adharNo;
	this.pancardNo = pancardNo;
	this.dateOfBirth = dateOfBirth;
	this.address = address;
	this.account = account;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getAdharNo() {
	return adharNo;
}

public void setAdharNo(String adharNo) {
	this.adharNo = adharNo;
}

public String getPancardNo() {
	return pancardNo;
}

public void setPancardNo(String pancardNo) {
	this.pancardNo = pancardNo;
}

public String getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}


}
