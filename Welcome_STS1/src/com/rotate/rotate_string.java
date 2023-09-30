package com.rotate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rotate_string {

	public static void main(String[] args) {
		String str="amazon";
		
		char c[]=str.toCharArray();
		List<Character> list=new ArrayList<>();
		for(Character cc:c)
		{
			list.add(cc);
		}
		list.forEach(p->System.out.print(p+" ")); 
		
		System.out.println("=====================================================================");
		
		Collections.rotate(list, 3); 
		
		list.forEach(p->System.out.print(p+" ")); 

	}

}
