package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		//Cascaded if --else statement(when more than two things will going be check)
		if(a>b && a>c)
		{
			System.out.println("A is greater"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater"+b);

		}
		else
		{
			System.out.println("C is greater"+c);
		}
		
		

	}

}
