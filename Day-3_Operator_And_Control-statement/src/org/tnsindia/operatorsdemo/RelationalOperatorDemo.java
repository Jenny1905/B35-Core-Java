package org.tnsindia.operatorsdemo;
//demo on Relational operator

import java.util.Scanner;

public class RelationalOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		boolean result=(a==b);
		//if condition is true it returns true else false
		//relational operator returns a boolean value:true/false
		System.out.println("The result is: "+result);
		s.close();


	}

}
