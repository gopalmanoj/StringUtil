package com.convert;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_to_Stream_char {

	public static void main(String[] args) {
		String message="welcome";
		
		int num=77345676;
		String str=Integer.toString(num);
		
		Map<Character, Long> mp=message.chars().mapToObj(p->(char)p). 
				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(mp); 
		
		System.out.println("===================================================");
		
		LinkedHashMap<Character,Long> c1=str.chars().mapToObj(p->(char)p).
				collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(c1); 
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
