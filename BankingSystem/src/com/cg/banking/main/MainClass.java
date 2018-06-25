package com.cg.banking.main;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Address;
import com.cg.banking.beans.Customer;
import com.cg.banking.beans.Transaction;

public class MainClass {

	public static void main(String[] args) {
		
		Customer customer=new Customer(12, "joe", "sunny", "7731004062", "joesunny49@gmail.com", "881067072704", "DRLPP8167A", "10-06-1997", 
										new Address(412112, "Pune", "Maharashtra", "India"),
										new Account(12345,  2000,"Savings", new Transaction(15756, 1500, "04:37:59","Credit", "Pune", "Online", "success")));
		
		System.out.println("Transaction Status is : " +customer.getAccount().getTransaction().getTransactionStatus());
	}
	

}
