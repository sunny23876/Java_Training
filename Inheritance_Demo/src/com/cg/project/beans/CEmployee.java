package com.cg.project.beans;

//public class CEmployee extends Employee 
public final class CEmployee extends Employee {//the class is declared as final .So this class is the last leaf of this hierarchy 
	//if a class is defined as final then all the methods in the class cannot be overridden
	//if some methods in a class are final then we cannot implement only those methods in other classes
	int noOfHrs,variablePay;
	
public CEmployee(){}

public CEmployee(int id, String firstname, String lastName, int basicSalary,int noOfHrs) {
	super(id, firstname, lastName, basicSalary);
	this.noOfHrs=noOfHrs;
}

public int getNoOfHrs() {
	return noOfHrs;
}

public void setNoOfHrs(int noOfHrs) {
	this.noOfHrs = noOfHrs;
}

public int getVariablePay() {
	return variablePay;
}

public void setVariablePay(int variablePay) {
	this.variablePay = variablePay;
}

@Override
public void calculateSalary() {
	variablePay=noOfHrs*120;
	this.setTotalSalary(getNoOfHrs()*variablePay);
}

public void signContract(){
	System.out.println("Contract is signed");
}

@Override
public String toString() {
	return super.toString()+" noOfHrs ="+noOfHrs+" variablePay =" +variablePay;
}



}
