package com.cg.mobile_billing.beans;

public class Plan {
  private int planID, monthlyRental, freeLocalCalls, freeStdCalls, freeLocalSMS, freeStdSMS, freeInternetDataUsageUnits;
  private String  localCallRate, stdCallRate, localSMSRate, stdSMSRate, internetDataUsageRate,planCircle, planName;
  
public Plan(){}

public Plan(int planID, int monthlyRental, int freeLocalCalls, int freeStdCalls, int freeLocalSMS, int freeStdSMS,
		int freeInternetDataUsageUnits, String localCallRate, String stdCallRate, String localSMSRate,
		String stdSMSRate, String internetDataUsageRate, String planCircle, String planName) {
	super();
	this.planID = planID;
	this.monthlyRental = monthlyRental;
	this.freeLocalCalls = freeLocalCalls;
	this.freeStdCalls = freeStdCalls;
	this.freeLocalSMS = freeLocalSMS;
	this.freeStdSMS = freeStdSMS;
	this.freeInternetDataUsageUnits = freeInternetDataUsageUnits;
	this.localCallRate = localCallRate;
	this.stdCallRate = stdCallRate;
	this.localSMSRate = localSMSRate;
	this.stdSMSRate = stdSMSRate;
	this.internetDataUsageRate = internetDataUsageRate;
	this.planCircle = planCircle;
	this.planName = planName;
}

public int getPlanID() {
	return planID;
}

public void setPlanID(int planID) {
	this.planID = planID;
}

public int getMonthlyRental() {
	return monthlyRental;
}

public void setMonthlyRental(int monthlyRental) {
	this.monthlyRental = monthlyRental;
}

public int getFreeLocalCalls() {
	return freeLocalCalls;
}

public void setFreeLocalCalls(int freeLocalCalls) {
	this.freeLocalCalls = freeLocalCalls;
}

public int getFreeStdCalls() {
	return freeStdCalls;
}

public void setFreeStdCalls(int freeStdCalls) {
	this.freeStdCalls = freeStdCalls;
}

public int getFreeLocalSMS() {
	return freeLocalSMS;
}

public void setFreeLocalSMS(int freeLocalSMS) {
	this.freeLocalSMS = freeLocalSMS;
}

public int getFreeStdSMS() {
	return freeStdSMS;
}

public void setFreeStdSMS(int freeStdSMS) {
	this.freeStdSMS = freeStdSMS;
}

public int getFreeInternetDataUsageUnits() {
	return freeInternetDataUsageUnits;
}

public void setFreeInternetDataUsageUnits(int freeInternetDataUsageUnits) {
	this.freeInternetDataUsageUnits = freeInternetDataUsageUnits;
}

public String getLocalCallRate() {
	return localCallRate;
}

public void setLocalCallRate(String localCallRate) {
	this.localCallRate = localCallRate;
}

public String getStdCallRate() {
	return stdCallRate;
}

public void setStdCallRate(String stdCallRate) {
	this.stdCallRate = stdCallRate;
}

public String getLocalSMSRate() {
	return localSMSRate;
}

public void setLocalSMSRate(String localSMSRate) {
	this.localSMSRate = localSMSRate;
}

public String getStdSMSRate() {
	return stdSMSRate;
}

public void setStdSMSRate(String stdSMSRate) {
	this.stdSMSRate = stdSMSRate;
}

public String getInternetDataUsageRate() {
	return internetDataUsageRate;
}

public void setInternetDataUsageRate(String internetDataUsageRate) {
	this.internetDataUsageRate = internetDataUsageRate;
}

public String getPlanCircle() {
	return planCircle;
}

public void setPlanCircle(String planCircle) {
	this.planCircle = planCircle;
}

public String getPlanName() {
	return planName;
}

public void setPlanName(String planName) {
	this.planName = planName;
}

}
