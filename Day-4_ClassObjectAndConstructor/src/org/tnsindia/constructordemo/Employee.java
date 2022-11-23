package org.tnsindia.constructordemo;



public class Employee {
	
	
	public int salary;
	public String name;
	//default constructor
	Employee()
	{
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
		
	}
	//method
	public void print()
	{
		System.out.println("The salary of "+name+" is: "+salary);
	}
	
	
	
	

}
