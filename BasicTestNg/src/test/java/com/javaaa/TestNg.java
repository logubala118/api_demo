package com.javaaa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg 
{
	@BeforeSuite
private void browserlink() 
{
	System.out.println("URL");

}
	@BeforeTest
	private void priority() 
	{
	System.out.println("Print B");	

	} 
	@BeforeClass
	
	private void setup() 
	{
		System.out.println("Browser launch successfully");

	}
	
	@BeforeMethod
	private void screenShot()
	{
	System.out.println("ScreenShot");

	}
	
	//@Test
	//private void test_A() 
	{
		System.out.println("A");

	}
	@AfterMethod
	private void screenshot() 
	{
		System.out.println("ScreenShot");

	}
	@AfterClass
	private void setUp()
	{
		System.out.println("Browser launch successfully");

	}
	@AfterTest
	private void priority_A()
	{
		System.out.println("Print_A");

	}
	@AfterSuite
	private void link()
	{
		System.out.println("Execution completed after all test cases");

	}
	
}
