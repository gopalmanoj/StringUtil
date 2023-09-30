package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class max_min_array {

	static void sort(int num[],int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}
	
		}
		
		//System.out.print(num[i]+" ");
		System.out.print(num[total-3]+" ");
		
	}
	public static void main(String[] args) {
		int num[]= {5,6,7,8,9,1,3,4}; 
		int nu[]= {90,50,60,20,10,70,30,40};   
		List<Integer> list=new ArrayList<Integer>();
		
		for(int ii:num)
		{
			list.add(ii);
		}
		System.out.println(list); 
		Collections.sort(list);
		System.out.println(list);
		int l=list.size()-1;
		System.out.println("Max Value\t"+list.get(l));
		System.out.println("Min Value\t"+list.get(0));
		System.out.println("_____________________________________________________________");
		
		sort(nu,8); 
		List<Integer> ll=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(ll.stream().filter(max_min_array::primeNo).collect(Collectors.toList())); 

	}
	static boolean primeNo(int num)
	{
		return IntStream.rangeClosed(2, num/2).noneMatch(p->num%p==0);
	}
	

}
