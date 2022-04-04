package com.samples.javademos.hashmapdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class testLinkedHashMap {
	
	public static void main(String[] args) {
		
		Map<String, String> mymap = new LinkedHashMap<String, String>();
		mymap.put("B","b");
		mymap.put("A","a");
		mymap.put("C","c");
		
		System.out.println(mymap);
		
		mymap.get("C");
		System.out.println(mymap);
		
		mymap.get("A");
		System.out.println(mymap);
		
		
	}

}
