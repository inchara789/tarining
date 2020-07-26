package com.demo;

public class Employee  {
	protected String firstname;
	protected String lastname;
	/*public Employee()
	{
		
	}*/
	public Employee(String firstname,String lastname)
	{
		System.out.println("inside employee");
		this.firstname=firstname;
		this.lastname=lastname;
	}

}
