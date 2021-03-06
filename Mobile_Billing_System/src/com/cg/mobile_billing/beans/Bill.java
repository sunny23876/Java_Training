package com.cg.mobile_billing.beans;

public class Bill {
	private int billID, noOfLocalSMS,stateGST,centralGST,totalBillAmount, localSMSAmount, stdSMSAmount, localCallAmount,  noOfStdSMS, noOfLocalCalls, noOfStdCalls, internetDataUsageUnits,internetDataUsageUnitsAmount;
	private String billMonth;
	public Bill(){}
	public Bill(int billID, int noOfLocalSMS, int stateGST, int centralGST, int totalBillAmount, int localSMSAmount,
			int stdSMSAmount, int localCallAmount, int noOfStdSMS, int noOfLocalCalls, int noOfStdCalls,
			int internetDataUsageUnits, int internetDataUsageUnitsAmount, String billMonth) {
		super();
		this.billID = billID;
		this.noOfLocalSMS = noOfLocalSMS;
		this.stateGST = stateGST;
		this.centralGST = centralGST;
		this.totalBillAmount = totalBillAmount;
		this.localSMSAmount = localSMSAmount;
		this.stdSMSAmount = stdSMSAmount;
		this.localCallAmount = localCallAmount;
		this.noOfStdSMS = noOfStdSMS;
		this.noOfLocalCalls = noOfLocalCalls;
		this.noOfStdCalls = noOfStdCalls;
		this.internetDataUsageUnits = internetDataUsageUnits;
		this.internetDataUsageUnitsAmount = internetDataUsageUnitsAmount;
		this.billMonth = billMonth;
	}
	public int getBillID() {
		return billID;
	}
	public void setBillID(int billID) {
		this.billID = billID;
	}
	public int getNoOfLocalSMS() {
		return noOfLocalSMS;
	}
	public void setNoOfLocalSMS(int noOfLocalSMS) {
		this.noOfLocalSMS = noOfLocalSMS;
	}
	public int getStateGST() {
		return stateGST;
	}
	public void setStateGST(int stateGST) {
		this.stateGST = stateGST;
	}
	public int getCentralGST() {
		return centralGST;
	}
	public void setCentralGST(int centralGST) {
		this.centralGST = centralGST;
	}
	public int getTotalBillAmount() {
		return totalBillAmount;
	}
	public void setTotalBillAmount(int totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}
	public int getLocalSMSAmount() {
		return localSMSAmount;
	}
	public void setLocalSMSAmount(int localSMSAmount) {
		this.localSMSAmount = localSMSAmount;
	}
	public int getStdSMSAmount() {
		return stdSMSAmount;
	}
	public void setStdSMSAmount(int stdSMSAmount) {
		this.stdSMSAmount = stdSMSAmount;
	}
	public int getLocalCallAmount() {
		return localCallAmount;
	}
	public void setLocalCallAmount(int localCallAmount) {
		this.localCallAmount = localCallAmount;
	}
	public int getNoOfStdSMS() {
		return noOfStdSMS;
	}
	public void setNoOfStdSMS(int noOfStdSMS) {
		this.noOfStdSMS = noOfStdSMS;
	}
	public int getNoOfLocalCalls() {
		return noOfLocalCalls;
	}
	public void setNoOfLocalCalls(int noOfLocalCalls) {
		this.noOfLocalCalls = noOfLocalCalls;
	}
	public int getNoOfStdCalls() {
		return noOfStdCalls;
	}
	public void setNoOfStdCalls(int noOfStdCalls) {
		this.noOfStdCalls = noOfStdCalls;
	}
	public int getInternetDataUsageUnits() {
		return internetDataUsageUnits;
	}
	public void setInternetDataUsageUnits(int internetDataUsageUnits) {
		this.internetDataUsageUnits = internetDataUsageUnits;
	}
	public int getInternetDataUsageUnitsAmount() {
		return internetDataUsageUnitsAmount;
	}
	public void setInternetDataUsageUnitsAmount(int internetDataUsageUnitsAmount) {
		this.internetDataUsageUnitsAmount = internetDataUsageUnitsAmount;
	}
	public String getBillMonth() {
		return billMonth;
	}
	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	} 
	
	

}
