package com.random;

import java.util.Random;

public class random_demo {

	public static void randomInts(int num, int origin, int bound)   
	{  
	Random random1 = new Random();  
	random1.ints(num, origin, bound).forEach(System.out::print);  
	}  
	public static void main(String[] args) {
		randomInts(5, 5, 9); 
		System.out.println();
		System.out.println("====================================================================="); 
		random_6(6, 5, 9); 

	}
	
	public static void random_6(int num,int start,int top)
	{
		Random r=new Random();
		int num1[]=r.ints(num, start, top).toArray();
		//.forEach(p->System.out.print(p)); 
		for(int n:num1)
		{
			System.out.print(n); 
		}
	}

}
