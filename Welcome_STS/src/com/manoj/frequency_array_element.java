package com.manoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class frequency_array_element {

	public static void main(String[] args) {

int num[]= {2,3,43,5,4,6,7,8,3,6,6,6,7,9,};

Map<Integer, Integer> h=new HashMap<Integer, Integer>();

for(int i=0;i<num.length;i++)
{
	if(h.containsKey(num[i]))
	{
		h.put(num[i], h.get(num[i])+1);
	}
	else
	{
		h.put(num[i], 1);
	}
}
System.out.println(h); 

List<Integer> ll=Arrays.stream(num).boxed().collect(Collectors.toList());


	}

}
