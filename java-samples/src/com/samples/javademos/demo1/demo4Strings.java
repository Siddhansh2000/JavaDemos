package com.samples.javademos.demo1;

public class demo4Strings {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = s1 + "world";
		String s3 = "45";
		
		int myint = Integer.parseInt(s3);
		int x = 10;
		
		//System.out.println(myint);
		
		s2 = s1+x;
		System.out.println(s2);
		function1();
		
	}
	
	static void function1()
	{
		String s4 ="43x";
		try {
			int myint = Integer.parseInt(s4);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Number exception occurred");
			throw nfe;
		}
		catch(Exception ex)
		{
			System.out.println("Failed to read user input" + ex.getMessage());
		}
	}
}
