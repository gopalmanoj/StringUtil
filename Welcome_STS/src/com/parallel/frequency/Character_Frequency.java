package com.parallel.frequency;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Character_Frequency {

	public static void main(String[] args) {
	String name="ManojMishra";
		
		char c[]=name.toCharArray();
		LinkedHashMap<Character, Integer> h=new LinkedHashMap<Character, Integer>();
		
		for(Character cc:c)
		{
			if(h.containsKey(cc))
			{
				h.put(cc, h.get(cc)+1);
			}
			else
			{
				h.put(cc, 1);
			}
		//System.out.println(h); 
		}
		System.out.println(h); 
		
	for(Map.Entry e:h.entrySet())
		{
			//System.out.println(e.getKey()+"\t"+e.getValue());
			int num=(Integer)e.getValue();
			if(num==1)
			{
				System.out.println(e.getKey());
				break;
			}
		}
	}

}
