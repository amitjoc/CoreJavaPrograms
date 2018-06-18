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
		
		for(Person person: personList) {
			person.walk();
		}
	}

}
