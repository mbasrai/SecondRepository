package com.icici.loans.carloans;

public interface Rbi 

{
  public void withdrawal ();
  public void deposit ();
  
  
  public static void main(String[] args) 
  
  {
		/*
		 * Rbi r =new hdfc(); r.deposit(); r.withdrawal();
		 */
	  
	  Rbi r;
	  r = new Icici();
	  r.deposit();
	  r.withdrawal();
	  
	  
	  r = new hdfc () ;
	  r.deposit();
	  r.withdrawal();
	  
	  
	System.out.println("I am withdrawal_deposit from  hdfc");
  }
  
}
