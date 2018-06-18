package com.java.interfacepractice;

public class Person {
	
	
	public String personName;
	
	public Person( String pname) {
		this.personName = pname;
	}
	
	public void walk() {
		System.out.println("Person (" + this.personName + ") is walking.");
	}
	
	 

}
