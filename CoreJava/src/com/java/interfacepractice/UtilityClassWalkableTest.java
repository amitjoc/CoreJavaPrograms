package com.java.interfacepractice;

public class UtilityClassWalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] personList = new Person[3];
		
		personList[0] = new Person("Jack");
		personList[1] = new Person("Amit");
		personList[2] = new Person("Abhishek");
		
		UtilityClassWalkable.LetThemWalk(personList);
		
		
	}

}
