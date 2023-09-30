package com.parallel;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {
		int numbers[] = {22, 89, 1, 32, 19, 5};
		
		
	long start=System.currentTimeMillis();
	
	Arrays.parallelSort(numbers);
	Arrays.stream(numbers).forEach(p->System.out.println(p)); 
	
	long end=System.currentTimeMillis();
	System.out.println("first\t"+(end-start));
	
	long start1=System.currentTimeMillis();	
	System.out.println("=========================================================================");
	Arrays.sort(numbers);
	Arrays.stream(numbers).forEach(p->System.out.println(p)); 
	
	long end1=System.currentTimeMillis();
	System.out.println("second\t"+(end1-start1)); 
	}

}
