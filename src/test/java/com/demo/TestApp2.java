package com.demo;


import junit.framework.Assert;
import org.junit.Test;

public class TestApp2 {

	@SuppressWarnings("deprecation")
	@Test
	public void testPrintHelloWorld2() {

		Assert.assertEquals(Application.getHelloWorld2(), "Hello World 2");

	}

}
