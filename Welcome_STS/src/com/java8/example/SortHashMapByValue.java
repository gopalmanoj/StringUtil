package com.java8.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		
		h.put("A", 90);
		h.put("B", 70);
		h.put("C", 85);
		h.put("D", 55);
		h.put("E", 65);
		h.put("F", 45);
		h.put("G", 75);
		
		h.entrySet().stream().forEach(p->System.out.println(p.getKey()+"\t"+p.getValue())); 
		System.out.println("________________________________________________________________________");
		h.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(p->System.out.println(p.getKey()+"\t"+p.getValue())); 
 
		
		System.out.println("________________________________________________________________________");
		h.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(p->System.out.println(p.getKey()+"\t"+p.getValue())); 
		
		
	}

}
