package com.convert;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class intArray_frequency {

	public static void main(String[] args) {
		int num[]= {5,3,4,5,7,8,9,7,8,7,5,1,2,3};
		
		Map<Integer, Long> m=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		 System.out.println(m); 
		 System.out.println();
		 String message="pwelcometoindia";
		 Map<Character,Long> sm=message.chars().mapToObj(p->(char)p).
				 collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		 Optional<Entry<Character, Long>> n=sm.entrySet().stream().filter(p->p.getValue()==1).findFirst(); 
		System.out.println(n); 
	}

}












