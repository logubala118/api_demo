package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	@Test
	private void test_A() {

		String actual = "Java";

		String expected = "Online";

		// Hard Assert
		Assert.assertEquals(actual, expected);

		// SoftAssert

		SoftAssert s = new SoftAssert();
	    s.assertEquals(actual, expected);
		s.assertAll();

	}

}
