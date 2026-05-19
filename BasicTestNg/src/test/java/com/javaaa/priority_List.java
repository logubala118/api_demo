package com.javaaa;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class priority_List 
{
@Test(priority = -2)
private void test_A() 
{
System.out.println("Print_B");	
}
@Test(enabled =false)
private void test_B() 
{
	System.out.println("Print_A");
}
@Test(invocationCount = 2,timeOut = 3000)
private void test_c() 
{
	System.out.println("print_c");

}
}
