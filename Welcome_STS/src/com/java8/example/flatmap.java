package com.java8.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class flatmap {
public static void main(String args[])
{
	List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
    
    // Creating a list of Odd Numbers
    List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
      
    // Creating a list of Even Numbers
    List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

    List<List<Integer>> listOfListofInts =
            Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
    
   List<Integer> list= listOfListofInts.stream().flatMap(p->p.stream()).collect(Collectors.toList());
   Collections.sort(list); 
   
   list.forEach(p->System.out.print(p+" "));
   
   Set<Integer> set=list.stream().collect(Collectors.toSet());
   System.out.println();
   set.forEach(p->System.out.print(p+" ")); 
   System.out.println();
   
   int num1[]= {1,2,3,4,5};
   int num2[]= {1,2,3,4,5,6};
   System.out.println(Arrays.equals(num1, num2)); 
}
}
