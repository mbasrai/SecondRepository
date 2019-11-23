package com.icici.loans.carloans;

public class SecondClass 

{
	//SecondClass i = new SecondClass();
	int a = 10;
	int b = 5;
	static int c;
	
	 public void add ()
	 {
		c = a + b;
		System.out.println("I am the addition of a+b :" + c);
		
	 }
	 
	 public void sub ()
	 
	 {
		 c = a-b;
		 System.out.println("I am the subtraction of a-b :" + c);
	 }
	 
	 

	public static void main(String[] args) 
	
	{
		System.out.println("Hello...");
		SecondClass obj =new SecondClass();
		obj.add();
		obj.sub();
		
		System.out.println("I am c:" + c);
		

	}

}
