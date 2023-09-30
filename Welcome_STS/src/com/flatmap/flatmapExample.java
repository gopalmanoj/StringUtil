package com.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapExample {
public static void main(String args[])
{
	List<Integer> l1=Arrays.asList(1,3,5,7,11);
	List<Integer> l2=Arrays.asList(2,4,6,8,10);
	List<List<Integer>> num=new ArrayList<List<Integer>>();
	
	num.add(l1);
	num.add(l2);
	
	List<Integer> allnum=num.stream().flatMap(p->p.stream()).collect(Collectors.toList());
	allnum.forEach(p->System.out.print(p+" "));
	//Collections.sort(allnum);
	
	allnum.stream().sorted().collect(Collectors.toList()).forEach(p->System.out.print(p+" ")); 
	System.out.println();
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	allnum.forEach(p->System.out.print(p+" "));
	System.out.println();
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	allnum.stream().filter(p->p%2==0).collect(Collectors.toList()).forEach(p->System.out.print(p+" ")); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
