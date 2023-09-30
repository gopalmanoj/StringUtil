package com.thread;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class fibonacci_1 {
	
	static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
		return fib(n-1)+fib(n-2);
		}
	}
	
	

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			System.out.println(fib(i)); 
		}
		
		
		//System.out.println("Fibonacci Series using Java 8 Stream :- ");
		 
        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]}) // 1. Iterate fibonacci number
        .limit(15) // 2. limit to 10 Integer numbers
        .map(n -> n[0]) // get 0th index from Arrays of size-2
        .forEach(fibNum -> System.out.print(fibNum + " "));
        
        System.out.println(); 
        
       // Stream.iterate(new int[] {0,1}, i->new int[] { i[1] , i[0]+i[1]}).limit(15). 
        //map(p->p[0]).forEach(p->System.out.println(p));  

	}

}
