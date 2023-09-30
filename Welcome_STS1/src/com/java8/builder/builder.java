package com.java8.builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class builder {

	public static void main(String[] args) {
		Stream.Builder<String> strBuilder=Stream.builder();
		
		Stream<String> stream=strBuilder.add("Gopal").add("Mohan").add("Kanhaiya").add("Krishna").build();
		List<String> list=stream.filter(p->p.startsWith("K")).map(p->p.toLowerCase()).collect(Collectors.toList());
		
		list.forEach(p->System.out.println(p));

	}

}
