package com.xworkz.map;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<String,String> students = new HashMap<String,String>(); //Creating HashMap   
		
		
		//HashMap contains only unique keys.
		
		students.put("1KI16IS003","rupa");  //Put elements in Map  
		students.put("1KI16IS010","pupa");  
		students.put("1KI16IS001","kupa"); 
		students.put("1KI16IS005","cupa");  
		students.put("1KI16IS020","Pupa"); 
		
		System.out.println(students);
		
		students.put("1KI16IS010","Veena");
		System.out.println(students);
		
		students.put("1KI16IS011","Raksha");
		students.put("1KI16IS011","Rashmi");
		System.out.println(students);
		
		students.put(null, null);
		System.out.println(students);
		
		students.put(null, "Swetha"); //may have one null key and multiple null values.
		students.put(null, "Sindhu");
		System.out.println(students);

	}

}

