package com.rotate;

import java.util.ArrayList;
import java.util.Arrays;import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Abc {
public static void main(String args[])
{
//	1,1,1,2,2,2,2,2,3,3,4,4,4,4,4,4
	
 List<Integer> list=Arrays.asList(1,1,1,2,2,2,2,2,3,3,4,4,4,4,4,4);
 
 Set<Integer> set=new HashSet<Integer>(list);
 
 for(Integer i:set)
 {
	 System.out.println(i+"\t"+Collections.frequency(list, i)); 
 }
 
 int num[]= {1,1,1,2,2,2,2,2,3,3,4,4,4,4,4,4};
 long sum=0;
 Map<Integer, Long> m=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())); 
 for(Map.Entry mm:m.entrySet())
 {
	
	
	sum=sum + (Long)mm.getValue();
	
	
 }
 System.out.println("sum\t"+sum); 
 
 String string="welcometoindia";
 
 Map<Character, Long> cf=string.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())); 
 System.out.println(cf); 
 
 String string2[]= {"A","B","C","D","E","F","C","D","E","F","D","E","F"};
 
 Map<String, Long> sf=Arrays.stream(string2).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
 
 System.out.println(sf); 
 
 String st="amazon";
 
 char c[]=st.toCharArray();
 
 
 for(Character cc:c)
 {
	 System.out.println(cc);
 }
 
 
 
	
}
}
