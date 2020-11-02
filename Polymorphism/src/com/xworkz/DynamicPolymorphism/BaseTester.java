package com.xworkz.DynamicPolymorphism;

public class BaseTester {
	 public static void main(String [] args) 
	  { 
	     Derived d = new Derived(); 
	      d.m1(); // Calling m1() method of class Derived. 
	    Base b = new Base(); 
	      b.m1(); // Calling m1() method of class Base. 
	   } 

}
