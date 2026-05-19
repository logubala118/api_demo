package com.java2;

public class Shopping_1 
{
void payMent() 
{
	System.out.println("COD IS AVALIABLE");
}
}
class Shopping_2 extends Shopping_1 
{
void payMent() 
{
System.out.println("Payment based on Card ");	
}
}
class mainclass_1
{
	public static void main (String[] args) 
	{
	Shopping_1 a=new Shopping_1();
	a.payMent();			
	}
	}
	