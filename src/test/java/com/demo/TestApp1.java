package com.demo;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp1 {

	@SuppressWarnings("deprecation")
	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(Application.getHelloWorld(), "Hello World");

	}

}
