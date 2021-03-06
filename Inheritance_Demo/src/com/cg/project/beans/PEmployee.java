package com.cg.project.beans;

public class PEmployee extends Employee {
	
	private int hra,ta,da;
	
	public PEmployee(){}

	public PEmployee(int id, String firstname, String lastName, int basicSalary) {//this c
		super(id, firstname, lastName, basicSalary);
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	@Override
	public void calculateSalary() {
		
		hra=this.getBasicSalary()*10/100;
		ta=this.getBasicSalary()*10/100;
		da=this.getBasicSalary()*10/100;
		this.setTotalSalary(hra+ta+da); 
	}

	@Override
	public String toString() {
		return super.toString()+" hra= "+hra+" ta= "+ta +" da="+da;
	}
	
	
	
	

}
