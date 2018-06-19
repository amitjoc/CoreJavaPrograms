/**
 * 
 */
package com.java.interfacepractice;

/**
 *@author AMIT JOSHI
 *
 */
public class UtilityClassWalkable {

	/**
	 * @param args
	 */
	public static void LetThemWalk(Person[] personList) {
		
		//person clas solution
		for(Person person: personList) {
			person.walk();
		}
		
	}
	
	public static void LetDuckWalk(Duck[] duckList) {
		for(Duck duck: duckList) {
			duck.walk();
		}
	}
	
	

}
