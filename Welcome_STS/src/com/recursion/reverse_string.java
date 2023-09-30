package com.recursion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class reverse_string {

	static String reverse_string(String str)
	{
		if(str.isEmpty())
		{
			System.out.println("String is Empty");
			return str;
		}
		else
		{
			return reverse_string(str.substring(1))+str.charAt(0);
		}
	}
	
	static String reverse_string1(String str)
	{
		
			return reverse_string(str.substring(1))+str.charAt(0);
			}
	public static void main(String[] args) {
		reverse_string r=new reverse_string();
		System.out.println(r.reverse_string("welcome")); 
		
		System.out.println("===================================================================");
		
		System.out.println(r.reverse_string1("manoj"));  
		
		List<Integer> numbers = Arrays.asList(5, 9, 112, 2, 8, 21, 1);
		
		Optional num=numbers.stream().max(Comparator.comparingInt(p->p));
		
		System.out.println(num); 

	}

}
