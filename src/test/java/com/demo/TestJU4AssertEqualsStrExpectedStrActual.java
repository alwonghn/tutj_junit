package com.demo;

import org.junit.Test;
import org.junit.Assert;


public class TestJU4AssertEqualsStrExpectedStrActual {

	@SuppressWarnings("deprecation")
	@Test
	public void testPrintHelloWorld() {

		// assertEquals(expected, actual);
		Assert.assertEquals(Application.getHelloWorld(), "Hello World");

	}

}
