package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
//		fail("Not yet implemented");
		String hello = "Hello";
		hello = hello.concat(" World"); // That way is a link created to a new string
		assertEquals("Hello World!!!", hello.concat("!!!"));
//		String hello = "Hello";
//		assertEquals("Hello World", hello.concat(" World"));
	}
	
	@Test
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}

}
