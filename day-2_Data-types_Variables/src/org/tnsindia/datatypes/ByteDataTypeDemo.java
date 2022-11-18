package org.tnsindia.datatypes;

//Demo on data-type as compile-time input
public class ByteDataTypeDemo {

	public static void main(String[] args) {
		//byte xyz=128 is not valid as it is out of range of byte data-type
		//data members
		int xyz=128;
		//int _abc=2147483648;is not valid as it is out of range of int data-type
		long _abc=2147483648L;
		System.out.println("The value is: "+xyz);
		System.out.println("The value is: "+_abc);
		char num='z';
		float c=15.67f;
		double d=41.9;
		String str="Shiwani";
		boolean var=true;
		int x=(int)12.5;//type-casting
		float y=(float)34;
		System.out.println("The value is: "+num);
		System.out.println("The value is: "+c);
		System.out.println("The value is: "+d);
		System.out.println("The value is: "+str);
		System.out.println("The value is: "+var);
		System.out.println("The value is: "+x);
		System.out.println("The value is: "+y);
	}

}
