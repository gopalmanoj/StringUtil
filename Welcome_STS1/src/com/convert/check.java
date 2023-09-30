package com.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class check {

	public static void main(String[] args) {
		
	//	Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
	//Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		List<List<Integer>> m=new ArrayList<List<Integer>>();
		
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(8);
		
		m.add(l1);
		m.add(l2);
	
		m.stream().flatMap(p->p.stream()).sorted().
		collect(Collectors.toList()).forEach(p->System.out.println(p));
		
		
	}

}
