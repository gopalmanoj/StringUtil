package com.hashmap.sort.byvalue;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortByValue {

	public static void main(String[] args) throws Exception {
		 
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		
	m.put(1, "B");
	m.put(2, "C");
	m.put(3, "A");
	m.put(4, "B");
	m.put(5, "D");
		
		System.out.println(m.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new)));
		
		Set set=m.entrySet();
		List<Entry<Integer, String>> list=new ArrayList<>(m.entrySet());
		
		
		Map<Integer, String> h=new LinkedHashMap<Integer, String>();
		
		System.out.println(list); 
		for(Map.Entry s:list)
		{
			System.out.println(s.getKey()+"\t"+s.getValue()); 
		}
	}

}
