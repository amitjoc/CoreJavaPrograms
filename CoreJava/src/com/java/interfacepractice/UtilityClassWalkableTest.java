package com.java.interfacepractice;

public class UtilityClassWalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] personList = new Person[3];
		
		personList[0] = new Person("Jack");
		personList[1] = new Person("Amit");
		personList[2] = new Person("Abhishek");
		
		UtilityClassWalkable.LetThemWalk(personList);
		
		System.out.println("====================================================");
		
		//now test soultion for duck class
		
		Duck[] duckList = new Duck[3];
		
		duckList[0] = new Duck("Huey");
		duckList[1] = new Duck("Dewey");
		duckList[2] = new Duck("Louie");
		
		UtilityClassWalkable.LetDuckWalk(duckList);
		
	}

}
