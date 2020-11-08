package com.xworkz.strings;

public class ImmutableString {
	
	public static void main(String[] args) 
	{ 
	 String s = "hello"; 
	 s.concat("world"); // concat() method adds string at the end. 
	 System.out.println(s); // It will print "hello" because string is immutable object. 
	 } 
	}


