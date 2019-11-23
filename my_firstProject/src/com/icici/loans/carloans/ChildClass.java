package com.icici.loans.carloans;

public class ChildClass extends FirstAbstract

{

	public static void main(String[] args)
	
	{
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();
		
		
		
		

	}

	@Override
	public void m2() 
	
	{
		System.out.println("I am override m2 from childclass");
		
	}
	
	/*
	 * public void m1() { //System.out.println("I am m1 concrete from ChildClass ");
	 * }
	 */

}
