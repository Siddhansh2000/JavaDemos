package com.samples.javademos.oop2;

public class StringHandling {

	public static void main(String[] args) {
	
		String s1 =new String("Hello World"); 
		System.out.println(s1.length());
	
		String sub =new String("Hello World"); 
		System.out.println(sub.substring(2));
		
		String s3 = "Word";
		String s4 = "World";

		System.out.println(s3.compareTo(s4));  	//0 =same
												//<0 = s3<s4
												//>0 = s3>s4
		
		String s5 ="";
		System.out.println(s5.isEmpty());
		
		StringBuffer sb = new StringBuffer ("Hello World");
		System.out.println(sb.toString());
	}
	
	
	
}
