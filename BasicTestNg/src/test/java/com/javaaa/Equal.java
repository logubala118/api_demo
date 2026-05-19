package com.javaaa;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Equal 
{	
	@Test
	private void test_a() 
	{
		String a = "java";
		String b="python";
		
	// hard
	//Assert.assertEquals(a, b);
	//SoftAssert c = new SoftAssert();
		//c.assertEquals(a, b);
		
	//soft
	SoftAssert c = new SoftAssert();
	c.assertAll();
	}



}
