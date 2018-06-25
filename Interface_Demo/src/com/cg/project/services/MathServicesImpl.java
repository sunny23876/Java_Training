package com.cg.project.services;

public class MathServicesImpl implements MathServices {//class implements interface
	
	public void calcMul(int n1,int n2){
		int x=n1*n2;
		System.out.println(x);
		
	}
   //methods are overriding
	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public void sub(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

	

}
