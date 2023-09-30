package com.convert;

import java.util.Arrays;
import java.util.stream.Stream;

public class intArray_to_Stream {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Stream<int[]> stream = Stream.of(array);
		System.out.println("\nInt stream: ");
		// Need to be flattened to its primitive type
		stream.flatMapToInt(Arrays::stream).filter(p->p%2==0).forEach(x -> System.out.print(x + " "));

		int num[]= {5,6,7,8,9,10,11,12,13,14,15};
		
		Stream<int[]> stream2=Stream.of(num);
		
		stream2.flatMapToInt(Arrays::stream).filter(p->String.valueOf(p).startsWith("1"))
		.forEach(p->System.out.println(p));
		
	}

}
