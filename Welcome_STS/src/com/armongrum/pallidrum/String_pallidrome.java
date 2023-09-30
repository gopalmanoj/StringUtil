package com.armongrum.pallidrum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class String_pallidrome {

	public static boolean isPrimeNo(String string)
	{
		
		//
		
		return IntStream.range(0, string.length()/2).noneMatch(i->string.charAt(i)!=string.charAt(string.length()-i-1));
		//return IntStream.range(0, string.length()/2).noneMatch(i->string.charAt(i)!=string.charAt(string.length()-i-1));
	}
	public static void main(String[] args) {
		String string="UAU";
		String rev="";
		int length=string.length();
	/*for(int i=length-1;i>=0;i--)
		{
			rev=rev+string.charAt(i);
		}
			if (string.equals(rev))
			{
		         System.out.println(string+" is a palindrome");
			}
		      else
		      {
		         System.out.println(string+" is not a palindrome");
		      }   
		**/
		
	boolean c=isPrimeNo(string);
		System.out.println(isPrimeNo(string)); 
			if(c==true)
			{
				System.out.println("Palindrome");  
			}
			
			
			String str="";
			
		 	
			
			
		

	}

}
