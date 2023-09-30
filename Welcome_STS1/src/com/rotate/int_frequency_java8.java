package com.rotate;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class int_frequency_java8 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,1,2,2,2,2,2,3,3,4,4,4,4,4,4);
 Map<Integer, Long> m=list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
 
 System.out.println(m); 
	}

}
