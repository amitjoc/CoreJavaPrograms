/**
 * 
 */
package com.tut.programs;

import java.util.Scanner;

/**
 * @author 		Amit Joshi 
 * @Question 	Write the Program to check given number is even or odd ?
 * @Hint		if Number divisible by 2 it is even else odd
 */



public class evenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num	;
		
		
		System.out.println("Enter the Number :");
		Scanner  sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Enterd Num is : " + ( checkEvenOdd(num) ? "Even": "Odd" ) );
		sc.close();
	}


	/** 
	 * @param  num number you want to check for even odd
	 * @return boolean return true if even else false for odd
	 * 
	 */
	 
	 
	public static boolean checkEvenOdd(int num) {
		return (num%2 == 0) ? true : false;
	}
	
}
