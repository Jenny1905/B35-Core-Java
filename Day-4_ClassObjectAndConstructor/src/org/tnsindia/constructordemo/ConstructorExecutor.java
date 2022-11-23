package org.tnsindia.constructordemo;
//driver class
public class ConstructorExecutor {

	public static void main(String[] args) {
		
		
		//object creation
		Employee e=new Employee();
		Employee e1=new Employee(25000,"Nikita");
		Employee e2=new Employee(45000,"Chaitali");

		e1.print();
		e2.print();

	}

}
