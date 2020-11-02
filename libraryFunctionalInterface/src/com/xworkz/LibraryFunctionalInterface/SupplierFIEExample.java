package com.xworkz.LibraryFunctionalInterface;

import java.util.function.Supplier;


public class SupplierFIEExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Supplier<Integer> supplier = ()->Integer.parseInt("30");
		System.out.println(supplier.get());
		
	}

}
