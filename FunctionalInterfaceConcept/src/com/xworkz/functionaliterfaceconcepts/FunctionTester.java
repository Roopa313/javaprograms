package com.xworkz.functionaliterfaceconcepts;

import java.util.funtion.Function;

public class FunctionTester {
	
	public static void main(String[] args) {
		
		//R apply(T,t)
		try {
			
		Function<String, Integer> func = (str)->{
			Integer i= Integer.parseInt(str);
			return i;
		}
		
		};
		
		Function<String, Integer> func2 = (str)->Integer.parseInt(str);
		
		System.out.println("The Integer is:" +func.apply("123"));
		
		
	}

}
