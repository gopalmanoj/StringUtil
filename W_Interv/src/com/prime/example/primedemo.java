package com.prime.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class primedemo {
	
	public static boolean primeNo(int num) {
		
		return IntStream.rangeClosed(2, num/2).noneMatch(p->num%p==0);
	}

	public static void main(String[] args) {
	
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		
		System.out.println(l.stream().filter(primedemo::primeNo).collect(Collectors.toList())); 

		//l.stream().reduce(0,(a,b)->a+b);
		
		System.out.println(l.stream().reduce(1,(a,b)->a*b)); 
		
		List<Integer> ll=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()); 
		System.out.println("Sorted Record"+ll);
		System.out.println("Second Highest No\t"+ll.get(1));  
	}

}
