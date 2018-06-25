package com.cg.mobile_billing.beans;

public class PostpaidAccount {
	private String mobileNo;
	private Plan plan;
	private Bill bill;
	
	
	public PostpaidAccount(){}


	public PostpaidAccount(String mobileNo, Plan plan, Bill bill) {
		super();
		this.mobileNo = mobileNo;
		this.plan = plan;
		this.bill = bill;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Plan getPlan() {
		return plan;
	}


	public void setPlan(Plan plan) {
		this.plan = plan;
	}


	public Bill getBill() {
		return bill;
	}


	public void setBill(Bill bill) {
		this.bill = bill;
	}

	
	
}
