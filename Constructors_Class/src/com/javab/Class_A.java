package com.javab;

public class Class_A 
{
	public  Class_A()  
    {
        System.out.println("GBHSSCHOOL");
    }
   public Class_A(String N)
   {
	   System.out.println(N);
   }
   public Class_A (int M,String P) {
   
	   System.out.println(M);
       System.out.println(P);
   }
   
    public static void main(String[] args)
    {
        Class_A c = new Class_A();  // object creation
        Class_A cc = new Class_A("Logu");
        Class_A ccc = new Class_A("Mark"+"=95");
        Class_A cccc = new Class_A("Precentage"+"=90%");
    }
}
