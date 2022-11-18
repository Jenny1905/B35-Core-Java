package org.tnsindia.datatypes;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
			//@SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
			
			/*Difference between next():It will take only first
			 * word of the string and and nextLine() will
			 * print entire string*/
			
			System.out.println("Enter the String:");
			String str=s.nextLine();
			String str1=s.next();
			
			System.out.println("The output is: ");
			
			System.out.println("The String is: "+str);
			System.out.println("The String is: "+str1);
			s.close();
	}

}
