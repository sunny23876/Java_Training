package com.cg.project.services;

public interface MathServices {//declaring  an interface
	
	int add(int n1,int n2);//even we define as abstract or not the method in a interface is always abstract we need to implement that in 
      //our class	
	public void sub(int n1,int n2);

	public abstract void div(int n1,int n2);
}
