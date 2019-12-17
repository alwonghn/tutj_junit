package com.demo;


import org.junit.Assert.assertThat;
import org.junit.Test;

public class TestApp2 {

	@SuppressWarnings("deprecation")
	@Test
	public void testPrintHelloWorld2() {

		//assertThat(actual, is(equalTo(expected)));
		assertThat("Hello World 2").equalsIgnoreCase(Application.getHelloWorld()));

	}

}
