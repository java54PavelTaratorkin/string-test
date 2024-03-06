package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello = "Hello";
		assertEquals("Hello World!!!", hello.concat(" World").concat("!!!"));
	}
	
	@Test
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}
	
	@Test
	void compareToTest() {
		String hello = "Hello";
		assertEquals(0, hello.compareTo("Hello"));
		assertTrue(hello.compareTo("hello") < 0);
		assertTrue(hello.compareTo("HELLO") > 0);
	}
	
	@Test
	void compareToIgnoreCaseTest() {
		String hello = "Hello";
		assertEquals(0, hello.compareToIgnoreCase("hello"));
		assertTrue(hello.compareToIgnoreCase("helloo") < 0);
		assertTrue(hello.compareToIgnoreCase("HE") > 0);
	}
	
	@Test
	void startsWithTest() {
		String hello = "Hello";
		assertTrue(hello.startsWith("He"));
		assertFalse(hello.startsWith("l"));
	}
	
	@Test
	void equalsIgnoreCaseTest() {
		String hello = "Hello";
		assertTrue(hello.equalsIgnoreCase("Hello"));
		assertFalse(hello.equalsIgnoreCase("helloO"));
	}
	
	@Test
	void lastIndexOfTest() {
		String hello = "Hello World!";
		assertTrue(hello.lastIndexOf("e") == 1);
		assertFalse(hello.indexOf("d") == 6);
	}

}
