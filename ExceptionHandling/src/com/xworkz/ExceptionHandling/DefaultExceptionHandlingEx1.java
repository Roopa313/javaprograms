package com.xworkz.ExceptionHandling;

public class DefaultExceptionHandlingEx1 {
	
	public static void main(String[] args) 
	{ 
	 m1(); // main() method calling m1(). 
	} 
	public static void m1() 
	{ 
	 m2(); // m1() method calling m2(). 
	} 
	public static void m2() 
	{ 
	  m3(); // m2() method calling m3(). 
	} 
	public static void m3() 
	{ 
	  System.out.println(1/0); // Exceptional case. A number cannot be divided by zero. 
	 } 
	}
//lets modify Defaultexception handling


