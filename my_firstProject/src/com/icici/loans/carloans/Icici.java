package com.icici.loans.carloans;

public class Icici implements Rbi 

{

	public static void main(String[] args)
	
	{
		Icici i=new Icici ();
		i.deposit();
		i.withdrawal();
		

	}

	@Override
	public void withdrawal() 
	
	{
		System.out.println("I am withdrawal from icici");
		
	}

	@Override
	public void deposit() 
	
	{
		System.out.println("I am deposit from icicic");
		
	}

}
