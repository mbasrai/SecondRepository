package com.constructor;

public class FirstConstructor 


{
	int eno;
	String ename;
    float sal;
    
	
	public FirstConstructor ()
	
	{
		System.out.println("I am ......");
	}


	
	  
	public FirstConstructor(int i) 
	
	{
		eno = i;
	}




	public FirstConstructor(int i, String string)
	
	{
		eno= i;
		ename = string;
	}




	public FirstConstructor(int i, String string, float f) 
	
	{
		eno= i;
		ename = string;
		sal = f;
	}




	public static void main(String[] args) 
	
	{
		FirstConstructor f = new FirstConstructor(1744,"Mez",1230.00f);
		
		/*
		 * f.eno = 1744; f. ename = "Mez"; f.sal = 2300.30f;
		 */
		
		
		System.out.println(f.eno);
		System.out.println(f.ename);
		System.out.println(f.sal);
		
		FirstConstructor f1 = new FirstConstructor(1784,"arsh",1230.00f);
		
		System.out.println(f1.eno);
		System.out.println(f1.ename);
		System.out.println(f1.sal);
	
	
		
		

	}


	

}
