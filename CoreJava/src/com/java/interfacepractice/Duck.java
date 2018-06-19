package com.java.interfacepractice;

/**
 * 
 * @author Amit Joshi
 *
 */

public class Duck {
	
	public String duckName;
	
	public Duck(String dname) {
		this.duckName = dname;
	}
	
	public void walk() {
		System.out.println("Duck (" + this.duckName + ") is walking.");
	}
	
	

}
