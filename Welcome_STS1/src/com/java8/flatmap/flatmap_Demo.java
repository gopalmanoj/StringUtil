package com.java8.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap_Demo {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,3,5,7,11);
		List<Integer> l2=Arrays.asList(2,4,6,8,10);
		
		List<List<Integer>> ll=new ArrayList<List<Integer>>();
		ll.add(l1);
		ll.add(l2);
		
		List<Integer> lll=ll.stream().flatMap(p->p.stream()).collect(Collectors.toList());
		lll.stream().sorted().forEach(p->System.out.print(p+" ")); 

	}

}
