package com.cg.mobile_billing.main;

import com.cg.mobile_billing.beans.Address;
import com.cg.mobile_billing.beans.Bill;
import com.cg.mobile_billing.beans.Customer;
import com.cg.mobile_billing.beans.Plan;
import com.cg.mobile_billing.beans.PostpaidAccount;

public class MainClass {

	public static void main(String[] args) {
		
		Customer customer=new Customer(121, "Joe","Sunny", "7731004062", "joesunny49@gmail.com", "881067072704", "DRLPP8167A", "10-06-1997",
										new Address("pune",	"Maharashtra", "India", 412114),PostpaidAccount );
	

	System.out.println("Total bill amount is:"+customer.getPostpaidAccount().getBill().getTotalBillAmount());
	}

}
