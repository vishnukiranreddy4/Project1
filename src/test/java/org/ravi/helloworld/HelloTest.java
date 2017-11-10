package org.ravi.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {
	Hello hello;

	@Before
	public void setUp() throws Exception {
		hello = new Hello();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDisplayHelloMessagae() {
		//fail("Not yet implemented");
		Object expected = "hi";
		Object actual = hello.displayHelloMessagae("hi");
		assertEquals(expected, actual);
		
	}

}
