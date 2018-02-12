package com.tut.programs;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  bread;
		  
		 try {
		 Scanner reader = new Scanner(System.in);
		 
		 if(reader.hasNextInt()) {

			 System.out.println("Not Allowed");
		 }else if(reader.hasNextLine()) {
			 bread = reader.nextLine(); 
			 System.out.println("Input is string" + bread );
		 }else {
			 System.out.println("input is not String");
		 }
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 
		
	}

}
