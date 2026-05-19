package com.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotations2 { // STCM

	@Test(priority = -2)
	private void test_B() {
		System.out.println("Test B");

	}

	@Test(enabled = false)
	private void test_A() {
		System.out.println("Test A");

	}

	@Ignore
	@Test(invocationCount = 2, timeOut = 3000)
	private void test_C() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Test C");

	}

}
