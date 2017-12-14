package com.tut.programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvenOdd {

	@Test
	void testCheckEvenOdd() {
		
		//for the even test
		 
		boolean actual = evenOdd.checkEvenOdd(4);
		assertEquals(true, actual);
	}

}
