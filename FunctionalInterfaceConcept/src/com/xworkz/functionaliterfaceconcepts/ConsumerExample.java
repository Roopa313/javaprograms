package com.xworkz.functionaliterfaceconcepts;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
		Consumer<String> printName =(str)->System.out.println("The entered name is:"+str);
		printName.accept("krupa");
		printName.accept("roopa");
	}
}

		
	


