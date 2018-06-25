package com.cg.project.beans;

//public class SalesManager extends PEmployee
public final class SalesManager extends PEmployee{

	private int salesAmt,commission;

	public SalesManager(){}

	public SalesManager(int id, String firstname, String lastName, int basicSalary ,int salesAmt) {
		super(id, firstname, lastName, basicSalary);
		this.salesAmt=salesAmt;

	}

	public int getSalesAmt() {
		return salesAmt;
	}

	public void setSalesAmt(int salesAmt) {
		this.salesAmt = salesAmt;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	@Override
	public void calculateSalary() {
		super.calculateSalary();
		commission=salesAmt*1/100;
		this.setTotalSalary(getTotalSalary()+commission);     
	}

	@Override
	public String toString() {
		return super.toString()+" salesAmt=" + salesAmt + ", commission=" + commission;
	}
	
	public void doASales(){
	   System.out.println("the sales manager do sales");	
	}

	
}
