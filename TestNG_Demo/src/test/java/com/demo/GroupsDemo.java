package com.demo;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GroupsDemo {
	
	@BeforeGroups({"mobiles" , "trousers" , "shirts"})
	private void browserLaunch() {
		System.out.println("Browser");
	}
	
	
	@Test(groups = "mobiles")
	private void test_B() {
		System.out.println("Test B");

	}

	@Test(groups = "trousers")
	private void test_A() {
		System.out.println("Test A");

	}

	
	@Test(groups = "mobiles")
	private void test_C() throws InterruptedException {
		System.out.println("Test C");

	}
	@Test(groups = "shirts")
	private void test_D() throws InterruptedException {
		System.out.println("Test D");

	}

}
