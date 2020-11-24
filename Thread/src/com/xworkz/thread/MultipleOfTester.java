package com.xworkz.thread;

public class MultipleOfTester {
	
public static void main(String[] args) {
	
	
		System.out.println("Main Thread program started");
		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
							" Name: "+ Thread.currentThread().getName());
		
		MultipleOfFive1 t1 = new MultipleOfFive1();
		t1.start();
		
		MultipleOf2 t2 = new MultipleOf2();
		t2.start();
		
		System.out.println("Thread program ended");
		System.out.println("End of Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
			
	}

}



