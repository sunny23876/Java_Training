package com.cg.project.beans;

//public class Employee
public abstract class Employee{// the class is declared as abstract so we cannot create object but it will have all the properties of a class
                               //if a class is defined as abstract then it is the first parent class in hierarchy	
							   
	private int id;
	private String firstname,lastName;
	private int basicSalary,totalSalary;
	
	public Employee(){}//we should have to create a default constructor for a parent class 	                   
	//else the super keyword in child class which refers to immediate  parent class cannot find parent class and shows an error

	public Employee(int id, String firstname, String lastName, int basicSalary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.basicSalary = basicSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
     public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public abstract void calculateSalary();//the method is declared as abstract so we need to define this method this in child class
	/*public void calculateSalary(){
   	 this.totalSalary=basicSalary;
    }*/

	@Override
	public String toString() {
		return "id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", basicSalary="
				+ basicSalary + ", totalSalary=" + totalSalary ;
	}
     
}

