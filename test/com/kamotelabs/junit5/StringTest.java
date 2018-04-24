package com.kamotelabs.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		int actualLength = "ABCD".length();
		int expectedLength = 5;
		assertEquals(expectedLength, actualLength);
		// Assert length == 4
		// Write test code
		// Invoke method square(4) Code under test
		// Checks in place - 16 => Assertions
	}

}
