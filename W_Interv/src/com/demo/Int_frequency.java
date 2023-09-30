package com.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Int_frequency {

	public static void main(String[] args) {
		int num[]= {1,2,1,2,3,4,5,6,7,8,9,8,7,6,5,6,7,8,5,4,6,7,8,9,3};
		
		Map<Integer,Long> l=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
		System.out.println(l); 
		
		List<Integer> ll=l.entrySet().stream().filter(p->p.getValue()>2).map(p->p.getKey()+1).
				collect(Collectors.toList());
		System.out.println(ll); 
	}

}
