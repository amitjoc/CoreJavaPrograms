package com.tut.programs;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
		// TODO Read the String from the console and read as integer or string as per method
		String  bread;
		  
		 try {
			 
			 System.out.print("Please Enter the String or Number :");
			 Scanner reader = new Scanner(System.in);
			 
			 if(reader.hasNextInt()) {
				 System.out.println("Input is the Integer : " + reader.nextInt());
			 }else if(reader.hasNextLine()) {
				 bread = reader.nextLine(); 
				 System.out.println("Input is string : " + bread );
			 }else {
				 System.out.println("input is not String");
			 }
			 
			 reader.close();
				
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 
		 
		 
		
	}

}
