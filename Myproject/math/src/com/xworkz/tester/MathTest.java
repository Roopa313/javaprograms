package com.xworkz.tester;

import com.xworkz.jeeprogram.MathOperation;
import com.xworkz.jeeprogram.MathOperationsImpl;


public class MathTest {
	
	public static void main(String[] args) {
		
		MathOperation mop =new MathOperationsImpl();
		
		System.out.println("Adding 10 and 20:"  +mop.addition(10,20));
		
		
		
		
	}

}
