package com.parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add_two_list {

	public static void main(String[] args) {
		List<String> alphabets = Arrays.asList("A","B","C");
		//list 2
		List<String> names = Arrays.asList("Sansa","Jon","Arya");
		
		List<String> title=Arrays.asList("Jha","Mishra","Thakur","Chaudhari","Tiwari");
			
		//creating two streams from the two lists and concatenating them into one
		Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());
			
		//displaying the elements of the concatenated stream
		//opstream.forEach(str->System.out.print(str+" "));
		
		List<List<String>> list=new ArrayList<List<String>>();
		
		list.add(alphabets);
		list.add(names);
		list.add(title);
		list.stream().flatMap(p->p.stream()).sorted().collect(Collectors.toList()).forEach(p->System.out.print(p+" "));


	}

}
