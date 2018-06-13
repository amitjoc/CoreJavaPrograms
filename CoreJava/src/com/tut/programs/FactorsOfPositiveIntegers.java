package com.tut.programs;

import java.util.Scanner;

/**
 * <p>
 * 		Question : Find all the factors of Given Positive Integer.<br>
 *	 	Hint : if any number a divides any number b completely with 0 reminder {a<=b}
 * </p> 
 * @author Amit Joshi
 * 
  
 */

public class FactorsOfPositiveIntegers {
	
	/**
	 * @author Amit Joshi
	 *  
	 * @param num	for which we want to genrate factors 
	 */
	
	public static int[] factorGenrator(int num) {
		
		int[] factorsArray = new int[num+1]; // to hold the factors needed one extra memory size
		 
		for(int loopCounter=1;	loopCounter<=num;	loopCounter++) {
			
			if(num%loopCounter == 0) {
				factorsArray[loopCounter]=loopCounter;
			}else {
				//do nothing or
				factorsArray[loopCounter]=0; // no meaning because default values are zero
			}
		}
	
		
		return factorsArray;
	}
		
	
	public static void main(String[] args) {
		
		int number, desiredFactorsArray [] ; // array is declared but initialized so size depands of return array
		
		System.out.println("Type the Number of Factors");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		System.out.println("==================================");
		desiredFactorsArray = factorGenrator(number);
		
		System.out.print("Desired Factors: [" );
		
		for(int lc=1;lc<=number;lc++) {
			if(desiredFactorsArray[lc] ==0) continue;
			System.out.print(desiredFactorsArray[lc] +" " );
		}
		
		System.out.println("]");
		
		sc.close();
		 
	}
}



