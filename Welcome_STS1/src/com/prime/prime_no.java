package com.prime;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class prime_no {
static boolean primeNo(int num)
{
	return IntStream.rangeClosed(2, num/2).noneMatch(p->num%p==0);
}
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		System.out.println(list.stream().filter(prime_no::primeNo).collect(Collectors.toList()));  

	}

}
