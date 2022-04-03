package com.samples.javademos.demo1;

public class demo6Casting {
	public static void main(String[] args) {
		
		System.out.println("Implicit type casting");
		char a = 'A';
		System.out.println("Value of a:" +a);
		int b = a;
		System.out.println("Value of b:" +b);
		float c = a;
		System.out.println("Value of c:" +c);
		long d = a;
		System.out.println("Value of d:" +d);
		double e = a;
		System.out.println("Value of e:" +e);
		
		System.out.println("");
		
		double x = 45.5;
		int y=(int)x;
		System.out.println("x =" +x);
		System.out.println("y =" +y);
	}
}
