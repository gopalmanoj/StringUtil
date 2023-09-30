package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_freq {

	public static void main(String[] args) {
		String string="generated";
		
		Map<Character, Long> m=string.chars().mapToObj(p->(char)p).collect(Collectors
				.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(m); 

	}

}
