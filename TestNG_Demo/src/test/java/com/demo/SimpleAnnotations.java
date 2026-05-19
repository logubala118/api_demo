package com.demo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations 
{  //STCM
	

	@BeforeSuite
	private void beforeSuite() {
		System.out.println("Before Suite");
		
		//Browser Launch 

	}
	
	
	@BeforeTest
	private void beforeTest() {
		System.out.println("Before Test");
		
		//Handle the Pop-up

	}
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
		
		//Cookies

	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
		
		//Screenshot

	}
	
	@Test
	private void test_A() {
		System.out.println("Test A");
		
		//Test Cases

	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
		
		//Final Result

	}
	
	@AfterTest
	private void afterTest() {
		System.out.println("After Test");
		
		//Cookies
		

	}
	
	
	@AfterMethod
	private void afterMethod() 
	{
		System.out.println("After Method");
		
		//Screenshot
	}
	@AfterSuite
	private void afterSuite()
	{
		System.out.println("After Suite");
		
		
		//Browser Close
	}
	
	
}
