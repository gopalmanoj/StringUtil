package com.manoj.Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapDemo {
public static void main(String args[])
{
	Integer n1[]= {1,2,3};
	Integer n2[] ={6,7,5};
	
	List<Integer> l=Arrays.asList(n1);
	List<Integer> l2=Arrays.asList(n2);
	
	List<List<Integer>> list=new ArrayList<List<Integer>>();
	
	list.add(l);
	list.add(l2);
	List<Integer> list2=list.stream().flatMap(p->p.stream()).collect(Collectors.toList());
	
	list2.forEach(p->System.out.println(p)); 
}
}
