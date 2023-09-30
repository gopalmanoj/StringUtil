package com.sort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Integer_frequency_array {

	public static void main(String[] args) {
		int num[]= {2,3,4,5,6,7,7,8,5,43,2,8,9};
		Stream<int[]> s=Stream.of(num);
		
		
		LinkedHashMap<Integer, Integer> h=new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			if(h.containsKey(num[i]))
			{
				h.put(num[i],h.get(num[i])+1);
			}
			else
			{
				h.put(num[i],1);
			}
		}
		System.out.println(h); 
		System.out.println("=========================================================");
		
		String string="ababsbdbcbdebsbwbcbfbesbqbrbf";
		
		Map<Character,Long> ss=string.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(ss); 
		
		
	}

}
