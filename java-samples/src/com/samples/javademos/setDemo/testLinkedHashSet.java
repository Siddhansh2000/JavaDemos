package com.samples.javademos.setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class testLinkedHashSet {

	// Both HashSet and LinkedHashSet provides uniqueness
	// insertion order
	
	//HashSet doesn't maintain the insertion order. 
	//Here, elements are inserted on the basis of their hashCode.

	//How to check hashCode of John , Alex ,... to check uniqueness
	
	public static void main(String[] args) {
		
		Set<String> myhashSet = new HashSet<>();
		myhashSet.add("John");
		myhashSet.add("Alex");
		myhashSet.add("Max");
		myhashSet.add("Tracy");
		myhashSet.add("Tracy");
		System.out.println(myhashSet);
		System.out.println(myhashSet.hashCode());
		
		Set<String> myhashSet2 = new LinkedHashSet<String>();
		myhashSet2.add("John");
		myhashSet2.add("Alex");
		myhashSet2.add("Max");
		myhashSet2.add("Tracy");
		System.out.println(myhashSet2);
	}
}
