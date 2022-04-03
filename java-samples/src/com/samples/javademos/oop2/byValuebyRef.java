package com.samples.javademos.oop2;

public class byValuebyRef {
	
	public static void main(String[] args) {
		
		House blueHouse = new House("blue");
		House anotherHouse = blueHouse;
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		anotherHouse.setColor("red");
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
	}

}
