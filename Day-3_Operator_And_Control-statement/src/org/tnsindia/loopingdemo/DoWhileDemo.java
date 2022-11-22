package org.tnsindia.loopingdemo;

public class DoWhileDemo {

	public static void main(String[] args) {
		int x=5;
		
		/*when you don't know the no.of iteration and at-least one time it will 
		 * execute
		 */
		do
		{
			System.out.println("The value of x is: "+x);
			x++;
		}while(x<8);

	}

}
