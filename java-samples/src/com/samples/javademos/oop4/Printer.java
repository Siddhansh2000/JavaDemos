package com.samples.javademos.oop4;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int tonerLevel, boolean duplex) {
		if(tonerLevel >=1 && tonerLevel<=100)
		{
			this.tonerLevel = tonerLevel;
		}
		else
		{
			this.tonerLevel =-1;
		}
		
		this.pagesPrinted =0;
		this.duplex = duplex;
	}
	
	
	
}
