package thread.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class thread_java8 {

	public static void main(String[] args) {
		Runnable r=()->
		{
			System.out.println("This is the first example of thread in java 8 ");
			for(int i=0;i<5;i++)
			{
				System.out.println(i); 
			}
		};
		
		Thread t=new Thread(r);
		
		t.start();
		
	String message="ababsbdebscbfwebdsbf";
	String h="Hello Welcome To the india city";
		LinkedHashMap<Character, Long> m=message.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		m.entrySet().stream().filter(p->p.getValue()==1).map(p->p.getValue()).findFirst();
		System.out.println("===========================================================================");
		
		System.out.println(m); 
		
		System.out.println("===========================================================================");
		
	String string[]=h.split(" ");
	
	for(int i=0;i<string.length;i++)
	{
		//System.out.println(string[i]);  
		
		if(string[i].length()>3)
		{
			System.out.println(string[i]);
		}
	}
		
	System.out.println("===========================================================================");	
	HashMap<Character, Long> mm=new HashMap<Character, Long>();
	
	mm=h.chars().mapToObj(p->(char)p).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

	mm.entrySet().stream().filter(p->p.getValue()==1).findFirst();
	System.out.println(mm); 
	}

}
