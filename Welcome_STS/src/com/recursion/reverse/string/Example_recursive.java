package com.recursion.reverse.string;

public class Example_recursive {
	
	public String recursive_reverse(String str)
	{
		if(str.isEmpty())  
		{  
		System.out.println("String is empty.");  
		//if the above condition is true returns the same string      
		return str;  
		}   
		else   {
	
			return recursive_reverse(str.substring(1))+str.charAt(0);
		}
		}

	public static void main(String[] args) {
		Example_recursive e=new Example_recursive();
		
		String resultt=e.recursive_reverse("manoj");
		
		System.out.println(resultt); 

	}

}
