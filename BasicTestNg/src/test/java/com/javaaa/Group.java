package com.javaaa;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Group 
{
@BeforeGroups({"Mobile","tshirt","light"})
private void browser_URL() 
{
System.out.println("link");
}

@Test(groups ="Mobile")
private void press_A() 
{
	System.out.println("press_m");
}
@Test(groups="tshirt")
private void press_B() 
{
	System.out.println("press_T");
}
@Test(groups="light")
private void press_c()
{
	System.out.println("press_l");

}
@Test(groups="light")
private void press_d()
{
	System.out.println("press_l");

}}
