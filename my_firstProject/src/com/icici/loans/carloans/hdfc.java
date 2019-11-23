package com.icici.loans.carloans;

public class hdfc implements Rbi

{

	public static void main(String[] args) 
	
	{
		hdfc h = new hdfc();
		h.deposit();
		h.withdrawal();

	}

	@Override
	public void withdrawal() 
	
	{
		System.out.println("withdrawal from hdfc");
		
	}

	@Override
	public void deposit() 
	
	{
		System.out.println("Deposit from HDFC");
		
	}

}
