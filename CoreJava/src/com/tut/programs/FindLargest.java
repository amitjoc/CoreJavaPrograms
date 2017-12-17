package com.tut.programs;

import java.util.Scanner;

public class FindLargest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3;
		int largest;
		Scanner sc = new Scanner(System.in);
		//read the three number
		System.out.println("Enter three numbers:");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		largest   = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
		
		System.out.println("Largest number is :" + largest);
		//close the scanner object
		sc.close();
		
	}

}
