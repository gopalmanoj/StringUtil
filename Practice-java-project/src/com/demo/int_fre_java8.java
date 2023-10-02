package com.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class int_fre_java8 {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,8,7,6,5,6,7,8,9,9,8,7,6,5,4,3};
		
		Map<Integer, Long> m=Arrays.stream(num).boxed().collect(Collectors.groupingBy(
				Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(m); 

	}

}
