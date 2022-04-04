package com.samples.javademos.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class trial {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int x[] = getIntegers(3);
		printMyArray(x);
		int y[] = Arrays.copyOf(x, x.length);
		printMyArray(y);
		
		// Way to print Array
		
		System.out.println(Arrays.toString(x));
		
	}

	private static void printMyArray(int[] x) {
		for (int i = 0; i < x.length; i++)
			System.out.println("Element " + i + ", value is " + x[i]);
		
	}

	private static int[] getIntegers(int n) {
		System.out.println("Enter " + n + " values");
		int a[] = new int[n];
		for(int i=0 ; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		return a;
	}	
	
	
}
