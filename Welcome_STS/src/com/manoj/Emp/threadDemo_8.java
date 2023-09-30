package com.manoj.Emp;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class threadDemo_8 {

	public static void main(String[] args) {
		Runnable runnable=()->{
		System.out.println("Welcome To The Thead Demo Project");
		};

		Thread t=new Thread(runnable);
	t.start();	
	
	String string="Hello?Gopal Is Welcome Is To The STS Project,It is the Java based project,"
			+ "It has requirement.minimum Java 8 version ";
	
	List<String> list=Arrays.stream(string.split("\\s")).collect(Collectors.toList());
	list.forEach(p->System.out.println(p)); 
	System.out.println("=========================================================================");
	//list.stream().filter(p->p.startsWith("H")).forEach(p->System.out.println(p)); 
	HashMap<String, Integer> h=new HashMap<String, Integer>();
	
	String str[]=string.split("[\\s , ? .]");
	int count=0;
	for(int i=0;i<str.length;i++)
	{
		//count++;
		//System.out.println(str[i]);
		if(str[i].length()>2)
		{
		System.out.println(str[i]);
		count++;
		}
		 
	}
	System.out.println(count);
	
	}

}
