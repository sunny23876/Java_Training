package com.cg.project.main;

import com.cg.project.beans.CEmployee;
import com.cg.project.beans.Employee;
import com.cg.project.beans.PEmployee;
import com.cg.project.beans.SalesManager;

public class MainClass {

	public static void main(String[] args) {
		
		/*Employee emp=new Employee(1, "joe", "sunny", 10000);
		System.out.println(emp.toString());*/
		
		Employee emp;//creating reference for abstract class
		
		/*PEmployee pemp=new PEmployee(1, "Sri", "Ramya", 6000);
		pemp.calculateSalary();
		System.out.println(pemp.toString());*/
		
        emp=new PEmployee(1, "Sri", "Ramya", 6000);
		emp.calculateSalary();// calculate salary method is an abstract method so we need to implement it in pemployee class
		System.out.println(emp.toString());

		
		/*CEmployee cemp=new CEmployee(1, "joe", "Sunny", 2000, 19);
		cemp.signContract();
		cemp.calculateSalary();
		System.out.println(cemp.toString());*/
		
		emp=new CEmployee(1, "joe", "Sunny", 2000, 19);
		CEmployee cemp=(CEmployee)emp;//the emp is of employee type it does not contain signcontract method 
		//since the sign contract is a special method for cemployee the emp reference do not know about it
		// so we need to downcast the employee type into cemployee type

		cemp.signContract();
		cemp.calculateSalary();
		System.out.println(cemp.toString());

		/*SalesManager salesmanager=new SalesManager(123, "josh", "Satya", 20000, 600000);
		salesmanager.calculateSalary();
		System.out.println(salesmanager.toString());*/
        
		emp=new SalesManager(123, "josh", "Satya", 20000, 600000);
		emp.calculateSalary();
		SalesManager salesmanager=(SalesManager)emp;
		salesmanager.doASales();//As like signcontract method doASales method is a special method only for salesmanager
		System.out.println(salesmanager.toString());

	}

}
