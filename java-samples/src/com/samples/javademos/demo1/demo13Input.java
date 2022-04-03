package com.samples.javademos.demo1;

import java.util.Scanner;

public class demo13Input {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("name entered: " + name);
		sc.close();
	}
}
