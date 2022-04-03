package com.samples.javademos.oops6.interfaces;

public class testInterface {

	public static void main(String[] args) {
		
		ITelephone tele = new DeskPhone();
		tele.powerOn();
	}
}
