package org.tnsindia.operatorsdemo;
//demo on Ternary  operator

import java.util.Scanner;

public class TerneryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();//11
		int b=s.nextInt();//65
		String result=(a>b)?"True":"False";
		System.out.println("The result is: "+result);

	}

}
