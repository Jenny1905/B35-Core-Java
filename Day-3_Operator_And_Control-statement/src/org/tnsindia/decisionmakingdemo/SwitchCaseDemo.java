package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num=s.next();
		
		//switch case to activate the caller-tune example
		switch(num)
		{
		case "Hi":
		{
			System.out.println("Kesariya");
			//break;
		}
		case "Hello":
		{
			System.out.println("Shree-Valli");
			break;
		}
		case "Cia":
		{
			System.out.println("Vaaste");
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
		}
		}
	}

}
