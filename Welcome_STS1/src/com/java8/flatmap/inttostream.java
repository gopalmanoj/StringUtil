package com.java8.flatmap;

import java.io.StringBufferInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class inttostream {

	public static void main(String[] args) {
		int[] array = {1234,1235,1236,43232,12443,5646334,1231412,6798796,8987};
		OptionalInt match = Arrays.stream(array)
		    .filter(p -> String.valueOf(p).startsWith("1"))
		    .sorted()
		    .findFirst();

		if (match.isPresent()) {
		    System.out.println(match.getAsInt());
		}
		else {
		    System.out.println("No matching number found");
		}

		long[] array1 = {2, 5, 9, 10, 15, 18, 56};
		LongStream stream = Arrays.stream(array1);
		System.out.println("Long stream:");
		stream.forEach(x -> System.out.print(x + " "));
		
		System.out.println("================================================="); 
		
	IntStream stream2=Arrays.stream(array);
		stream2.forEach(p->System.out.println(p));  
		System.out.println("=================================================");
		int[] array_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Stream<int[]> stream_1 = Stream.of(array_1);
		System.out.println("\nInt stream: ");
		// Need to be flattened to its primitive type
		stream_1.flatMapToInt(Arrays::stream).forEach(x -> System.out.print(x + " "));
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int num[]= {5,6,7,8,9,10,11,12,13,14,15};
		
		Stream<int[]> n=Stream.of(num);
	    n.flatMapToInt(Arrays::stream).filter(p->String.valueOf(p).startsWith("1")).forEach(p->System.out.println(p));
	    
		
		
		
		
	}

}
