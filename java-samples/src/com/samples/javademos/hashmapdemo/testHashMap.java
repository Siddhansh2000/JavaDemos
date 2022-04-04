package com.samples.javademos.hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("John", 25);
		map1.put("Max", 25);
		map1.put("Raj", 25);
		
		System.out.println(map1);
		
		map1.put("John", 31);
		
		System.out.println(map1);
		
		System.out.println("john?" + map1.containsKey("John"));
		System.out.println("wilson?" + map1.containsKey("Wilson"));
		
		System.out.println("Raj age:" + map1.get("Raj"));
		
		System.out.println("all keys" + map1.keySet());
		System.out.println("all values" + map1.values());
		
		Set<String> names = map1.keySet();
		
		for(String i : names)
			System.out.println("Name: "+ i + "Age: " + map1.get(i));
		
		//Map of Maps
		
//		Map<String, Map<String, Object>> userProfiles = new HashMap<String, Object>();
			
		
		
	}
}
