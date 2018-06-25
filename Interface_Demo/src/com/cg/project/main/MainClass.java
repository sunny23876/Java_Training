package com.cg.project.main;

import com.cg.project.services.MathServices;
import com.cg.project.services.MathServicesImpl;

public class MainClass {

	public static void main(String[] args) {
		
		MathServices mathServices =new MathServicesImpl();//creating a reference of interface with an object for other class 
		 int y =mathServices.add(5,110);//calling the method
		System.out.println(y);
		MathServicesImpl mathServicesImpl=(MathServicesImpl)mathServices;//the calcMul is a special method in MathServicesImpl class
								//so to call it we need to downcast the mathservices type refernce to MathservicesImpl type reference
        mathServicesImpl.calcMul(20, 30);
	}

}
