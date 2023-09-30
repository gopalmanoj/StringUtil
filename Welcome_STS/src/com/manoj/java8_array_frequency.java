package com.manoj;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java8_array_frequency {

	public static void main(String[] args) {
		int num[]= {2,3,43,5,4,6,7,8,3,6,6,6,7,9,};
		String nam[]= {"Mohan","Gopal","Karishna","Mohan","Kanhaiya","Kanhaiya"};
		
		Map<Integer,Long> freq=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
		
		System.out.println(freq);
		
		Map<Integer, Long> fre=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
		
		System.out.println(fre); 
		

	}
}
