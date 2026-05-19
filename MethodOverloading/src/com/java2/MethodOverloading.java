package com.java2;

public class MethodOverloading 
{
public void vehicle() 
{
System.out.println("R15");	
}
public void vehicle(char C)
{
System.out.println(C);	
}
public static void main(String[] args)
{
	MethodOverloading a=new MethodOverloading();
	a.vehicle();
	a.vehicle('y');
	
}
}
