package com.recursion.reverse.string;

public class Recursion_Reverce_String {
	
	public String reverseString(String str)  
	{  
	//checks if the string is empty   
	if(str.isEmpty())  
	{  
	System.out.println("String is empty.")  ;
	//if the above condition is true returns the same string      
	return str;  
	}   
	else   
	{  
	return reverseString(str.substring(1))+str.charAt(0);  
	}
	}  

	public static void main(String[] args) {
		Recursion_Reverce_String r=new Recursion_Reverce_String();
		
	String name=	r.reverseString("manoj");
	
	System.out.println(name);  

	}

}
