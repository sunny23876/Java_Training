package com.cg.payroll.main;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;

public class MainClass {

	public static void main(String[] args) {

   Associate associate=new Associate(12, 12000, "joe", "sunny", "DCX", "Associate", "DRLPP8167A", "joesunny49@gmail.com", new BankDetails(12345,"SBI", "SBIN0017903"), new Salary(13162, 1200, 1200));
	
   
   System.out.println("Associate account number is : "+associate.getBankDetails().getAccountNumber() );

}
}



