package com.java8.flatmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class testt {

	public static boolean isprime(int number)
	{
		return IntStream.rangeClosed(2, number/2).noneMatch(p->number%2==0);
	}
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10,11};
		
		Stream<int[]> stream=Stream.of(num);
		//stream.flatMapToInt(Arrays::stream).filter(p->p%2==0).forEach(p->System.out.println(p));
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<num.length;i++)
		{
			l.add(num[i]);
			
		}
		
	//List<Integer> ll=l.stream().filter(testt::isprime).collect(Collectors.toList());
		
		List<Integer> ll=l.stream().filter(t->testt.isprime(t)).collect(Collectors.toList()); 
	
	System.out.println("Prime No\t"+ll); 
	
	stream.flatMapToInt(Arrays::stream).filter(p->String.valueOf(p).startsWith("1"))
	.forEach(p->System.out.println(p));
		
	}

}
