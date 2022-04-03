package com.samples.javademos.demo1;

public class demo5operators {
	public static void main(String[] args) {
		
		int age=25;
		//String message = (age>20) ? "can rent a car" : "wait for a while";
		boolean isCarAvailable = false;
		
		String message = (age>20) ? (isCarAvailable) ? "can rent a car" : "wait for a while" :" kugkagku" ; 
		
		System.out.println(message);
	
	}

}
