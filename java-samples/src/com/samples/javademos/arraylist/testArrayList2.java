package com.samples.javademos.arraylist;

import java.util.ArrayList;
import java.util.List;

import com.samples.javademos.oop3.BoxCase;
import com.samples.javademos.oop3.IFlyable;
import com.samples.javademos.oop3.Monitor;

public class testArrayList2 {

	public static void main(String[] args) {

		ArrayList<IFlyable> flyingObjects = new ArrayList<>();
		flyingObjects.add(new BoxCase("220B", "Dell", "244"));
		flyingObjects.add(new Monitor("27 Inch", "Acer", 27));

		for (IFlyable flyingThings : flyingObjects)
			flyingThings.fly();

		for (int i=0; i<flyingObjects.size(); i++) {
			flyingObjects.get(i).fly();
		}
		
		System.out.println("--------------------------------------------");

		List<String> strList = new ArrayList<String>();
		strList.add("Hello");
		strList.add("world");
		strList.add("java");
		strList.add("coding");
		strList.add("is fun");

		for (String s : strList)
			System.out.println(s);		

		System.out.println("--------------------------------------------");

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(41);
		intList.add(42);
		intList.add(24);
		intList.add(34);
		for (Integer i : intList)
			System.out.println(i);
	}
}
