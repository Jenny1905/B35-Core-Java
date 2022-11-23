package org.tnsindia.classdemo;

import java.util.Scanner;

//Driver class
public class ClassAndObjectDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of the car:");
		int speed=s.nextInt();
		
		//creation of object
		Car obj=new Car();
		
		//compile time input
		//obj.speed=45;
		obj.speed(speed);
		s.close();

	}

}
