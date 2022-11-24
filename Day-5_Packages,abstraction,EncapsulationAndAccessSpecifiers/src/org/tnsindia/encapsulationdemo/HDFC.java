package org.tnsindia.encapsulationdemo;

public class HDFC {
	
	//data member
	private double amount;

	/*getters and setters method to access the private data members
	 * into the another class*/
	

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	/*if any members is declared as private we can access only inside the
	same class*/
	
	/*public static void main(String[] args) {
		HDFC h=new HDFC();
		h.amount=897;
		System.out.println(h.amount);
	}*/

}
