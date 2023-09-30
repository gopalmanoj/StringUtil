package com.java8.builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class custome_class_builder {

	public static void main(String[] args) {
		Stream.Builder<Employee> builder=Stream.builder();
		
		Stream<Employee> stream=builder.add(new Employee(1, 55000, "A")).
				add(new Employee(2, 65000, "B"))
				.add(new Employee(3, 75000, "C")).build();   
		
		stream.forEach(p->System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSalary()));
		
		Stream<Integer> st=Stream.of(1,2,3,4,5,6,7,8,9,10,11);
		IntStream intStream=IntStream.range(2, 5);
		IntStream intStream2=IntStream.of(3,4,5,6,8,9,11,15,17);
		List<Integer> even=st.filter(p->p%2==0).collect(Collectors.toList());
		System.out.println();
		System.out.println("====================================================");   
		
		even.forEach(p->System.out.println(p)); 
		
		System.out.println();
		System.out.println("====================================================");   
		
		intStream.forEach(p->System.out.println(p)); 
		
		System.out.println();
		System.out.println("====================================================");   
		
	for(int i=2;i<10;i++)
	{
		intStream2.filter(p->p%2!=0 & p%3!=0& p%4!=0 & p%4!=0 & p%5!=0);
	}

	}

}
