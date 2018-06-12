package com.tut.sys.properties;

import java.util.Enumeration;
import java.util.Properties;

public class AccessSystemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Getting the System Prperties");
		System.out.println("-------------------------------");
		
		
		Properties sysProperties = new Properties( System.getProperties());
		
		
		//we can also add our custom properties to the variable 
		
		sysProperties.put("myCustomProperties", "Hello Bro this is custom property set by me");
		
		
		
		//method one the simple one
		//to use below method remove comment
		//sysProperties.list(System.out);
		
		//method two using the enumeration class
		Enumeration keys = sysProperties.propertyNames();
		 
		 while(keys.hasMoreElements()) {
			 String key 	= 	(String)	keys.nextElement();
			 String value 	= 	(String)	sysProperties.getProperty(key);
			 System.out.println(key  + "------------>" +  value.trim());
		 }
	}

}
