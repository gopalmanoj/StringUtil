package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class string_char_freq_java8 {

	public static void main(String[] args) {
		String string="jaishreegopalkrishna";
		
		Map<Character, Long> m=string.chars().mapToObj(p->(char)p).collect(
				Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(m); 
		
		Map<Character, Long> sor=m.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
				,(e1,e2)->e1,LinkedHashMap::new));     
		
		System.out.println(sor);   

	}

}
