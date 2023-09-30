package com.armongrum.pallidrum;

import java.util.stream.IntStream;

public class int_pallidrome_java8 {

	public static boolean ispallidrome(int num)
	{
		String string=Integer.toString(num);
		return IntStream.range(0,string.length()/2).noneMatch(i->string.charAt(i)!=string.charAt(string.length()-i-1));
	
	}
	public static void main(String[] args) {
		
		boolean check=false;
		check=ispallidrome(1213);
		if(check==true)
		{
			System.out.println("No is pallidrome");
		}
		else
		{
			System.out.println("No is not pallidrome");  
		}
 
		System.out.println(ispallidrome(9));  
	}

}
