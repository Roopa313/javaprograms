package com.xworkz.runnable;

public class Multipleof4 implements Runnable {
	
	@Override
	public void run() {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
		int num = 4;
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " +(num*i));
		}
		
		System.out.println("End od Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
	}

}


