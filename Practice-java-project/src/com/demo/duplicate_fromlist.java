package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicate_fromlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Hello");
	String string="amazon";
	for(int i=0;i<string.length();i++)
	{
		System.out.println(string.toUpperCase()); 
	}
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,3,3,3,4,5,6,4,5);
	Set<Integer> duplicate=list.stream().filter(p->Collections.frequency(list, p)>1).
			collect(Collectors.toSet());
	System.out.println("Duplicat Records Are\t"+duplicate); 
	
	Map<Integer, Long> m=list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
			Collectors.counting()));
	m.entrySet().stream().filter(p->p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
		));
	
	System.out.println(m); 
	System.out.println("Duplicate records are following"); 
	System.out.println(m.entrySet().stream().filter(p->p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
		))); 
	}

}
