package com.xworkz.TypeConversionAndTypeCasting;

public class WideningConversionEx {
	
	 
	 public static void main(String[] args) 
	 { 
	   int a = 50; //small DT
	   double d = 100d; //larger DT
	// Automatic type conversion 
	    long l = a; 
	 // int i = l; // Type mismatch: cannot convert from long to int.
	 
	// Automatic type conversion 
	     float f = l; 
	  // int i1 = f; // Type mismatch: cannot convert from float to int. 
	  // float f1 = d; // Type mismatch. 
	     double d1 = f; 

	   System.out.println("Int value "+a); 
	   System.out.println("Long value "+l); 
	   System.out.println("Float value "+f); 
	   System.out.println("Double value " +d1); 
	  } 
	}


