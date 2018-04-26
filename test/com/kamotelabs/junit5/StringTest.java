package com.kamotelabs.junit5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {

	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data " + info.getDisplayName());
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Clean up Test Data.");
	}

	@Test
	void lengthBasicTest() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;

		assertEquals(expectedLength, actualLength);
		// Assert length == 4
		// Write test code
		// Invoke method square(4) Code under test
		// Checks in place - 16 => Assertions
	}

	@Test
	void toUpperCaseTest() {
		String str = "abcd";

		assertEquals("ABCD", str.toUpperCase());
		assertNotNull(str.toUpperCase());
		// assertNull(result);
	}

	@Test
	void containsBasic() {
		String str = "abcdefgh";

		assertEquals(false, str.contains("cddef"));
		assertFalse(str.contains("cddef"));
	}

	@Test
	void splitBasic() {
		String str = "abc def ghi";
		String[] actualResult = str.split(" ");
		String[] expectedResult = new String[] { "abc", "def", "ghi" };

		assertArrayEquals(actualResult, expectedResult);
	}

}
