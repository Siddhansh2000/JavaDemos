package com.samples.javademos.demo1;

public class demo10For {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("loop " + i + " Hello");
		}

		for (int i = 2; i <= 5; i++) {
			System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
		}
	}

	private static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
