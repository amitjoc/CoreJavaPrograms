package com.tut.programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvenOdd {

		//Test for the Even Number
		//return the true for even number 
		@Test
		public void testForEven() {
			boolean TrueForEven = evenOdd.checkEvenOdd(4);
			assertEquals(true, TrueForEven);
		}
		
		
		//Test for the Odd number 
		//return for the false for odd number
		@Test
		public void testForOdd() {
			boolean falseForOdd = evenOdd.checkEvenOdd(5);
			assertEquals(false, falseForOdd);
		}
		
 }
