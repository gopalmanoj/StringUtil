package com.number;

import java.util.ArrayList;
import java.util.List;

public class String_Pallidrom {

	public static void main(String[] args) {
		String string="UMU";
		
		StringBuffer sb=new StringBuffer(string);
		String ss=sb.reverse().toString(); 
		
		if(string.equals(ss))  
		{ 
			System.out.println("Pallidrome");
		}
		else
		{
			System.out.println("Not Pallidrome");  
		}
//====================================================================================================
		String reversed = string.chars()
			    .mapToObj(c -> (char)c)
			    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
		System.out.println(string+"\t"+reversed);
		if(string.equals(reversed))
		{
			System.out.println("Pallidrome");
		}
		else
		{
			System.out.println("Not Pallidrome");  
		}
	}

}
