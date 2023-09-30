package com.duplicate.integer.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicate_Element {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(5);
		l.add(4);
		
		Set<Integer> ll=l.stream().filter(p->Collections.frequency(l, p)>1).collect(Collectors.toSet());
		
		ll.forEach(p->System.out.println(p)); 
		System.out.println("===========================================================");
		List<String> strings=new ArrayList<String>();
		
		strings.add("Rashmi");
		strings.add("Rashmi");
		strings.add("Gopal");
		strings.add("Madhu");
		strings.add("Gopal");
		strings.add("Rajiv");
		strings.add("Vikash");
		
		
		Set<String> set=strings.stream().filter(p->Collections.frequency(strings, p)>1).collect(Collectors.toSet());
		set.forEach(p->System.out.println(p));
		
		
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		m.entrySet().stream().sorted();
	}

}
