package com.sort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class charCount {

	public static void main(String[] args) {
		
		String message="nnanasbbsddcchhggfrdesb";
		LinkedHashMap<Character, Long> charcount1= message.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	//Optional<Character> op=	charcount1.entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).findFirst();
	
	//if(op.isPresent())
	{
		
	//System.out.println(op);
	
	}
	System.out.println(charcount1); 
	}

}
