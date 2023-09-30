package com.manoj;

import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class duplicate_no {

	public static void main(String[] args) {
		
 int num[]= {2,3,43,5,4,6,7,8,3,6,6,6,7,9,8};
 String string[]= {"Gopal","Krishna","Kanhaiya","Mohan","Murari"};
 
 Set<Integer> set=new TreeSet<Integer>();
 for(int i=0;i<num.length;i++)
 {
	 set.add(num[i]);
 }
//System.out.println(set);

Arrays.stream(num).distinct().forEach(p->System.out.println(p));
java.util.List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
list.forEach(p->System.out.println("Result\t"+p)); 

java.util.List<String> str=Arrays.stream(string).collect(Collectors.toList());
System.out.println(str); 

	}

}
