package com.xworkz.map;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapEx {
	
		public static void main(String[] args) {
			
			LinkedHashMap<Integer,String> aadharNumber = new  LinkedHashMap<Integer,String>(); //Creating LinkedHashMap
			
			aadharNumber.put(187234506, "chinu");
			aadharNumber.put(243217890, "Ranu");
			aadharNumber.put(564327890, "Aaha");
			aadharNumber.put(345621099, "Shree");
			aadharNumber.put(152375489, "reena");
			
			System.out.println(aadharNumber);
			
			//Traversing:
			System.out.println();
					
			Set<Entry<Integer,String>> entry = aadharNumber.entrySet();
					
			for(Entry<Integer,String> e : entry) {
					System.out.println("My key: "+ e.getKey() + " My value: "+ e.getValue());
			}	
			
		}

	}



