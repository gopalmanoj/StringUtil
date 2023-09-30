package com.integer.frequency.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Integer_Frequency {

	public static void main(String[] args) {
		int num[]= {3,2,4,3,5,6,7,8,9,7,6,5,4};
		
		Map<Integer, Long> m=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
			System.out.println(m); 
			
			for(Map.Entry<Integer, Long> mm:m.entrySet())
			{
				if(mm.getValue()==1)
				{
					System.out.println(mm.getKey());
					break;
				}
				
				
			}
			
			Map<Integer,Long> f=Arrays.stream(num).sorted().boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
			

		Optional o=	m.entrySet().stream().filter(p->p.getValue()<2).findFirst();
			
			System.out.println("First Non repeating no is\t"+o);
			 
			
			String city[]= {"delhi","Patna","delhi","Mumbai","Lucknow","Patna","Patna","delhi","delhi","delhi"};
			
			Map<String, Long> sf=Arrays.stream(city).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(sf); 
			
			String string="rashmikumari";
			Map<Character,Long> mm=string.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			System.out.println("====================================================================");
			System.out.println(mm); 
			
	}

}
