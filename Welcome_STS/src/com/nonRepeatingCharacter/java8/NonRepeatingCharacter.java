package com.nonRepeatingCharacter.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
	String message="hello welcome";
	
	Map<Character, Long> charcount=message.chars().mapToObj(p->(char)p).
			collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	Optional<Character> firstNonRepeating=charcount.entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).findFirst();
	
	if(firstNonRepeating.isPresent())
	{
		System.out.println("firstNonRepeating\t"+firstNonRepeating);
	}
	
	/*Map<Character, Long> c=message.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	Optional<Character> fnrc=c.entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).findFirst();
	
	System.out.println(fnrc); */
	
	
	Map<Character, Long> charcount1= message.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
Optional<Character> op=	charcount1.entrySet().stream().filter(p->p.getValue()==1).map(p->p.getKey()).findFirst();
	System.out.println(charcount1);
	if(op.isPresent())
	{ 
		System.out.println("repeting\t"+op);
	}
	
/*Map<Character, Long> charcount11=message.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	
	int num[]= {3,4,2,9,7,9,5,6,7,8};
	
	Stream.of(num).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	Stream<Character> charArray = Stream.of('a', 'a', 'c', 'd', 'd', 'd', 'd');
	Stream<Integer> ele=Stream.of(2,3,4,5,5,6,5,4,3,7);
    Map<Character, Long> result1 = charArray.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(result1);
    
    Map<Integer, Long> result2 = ele.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(result2);  **/
	}

}
