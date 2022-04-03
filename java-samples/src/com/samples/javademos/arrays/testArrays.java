package com.samples.javademos.arrays;

public class testArrays {
	public static void main(String[] args) {
		
		int a[] = new int [10];
		a[4]=10;
		
		for(int i=0;i<9;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		System.out.println();
		System.out.println("=================================");
		
		int x[] = {11,12,13,8,7,9,4};
//		System.out.println(x.length);
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+x[i]);
		}
		
		
	}

}
