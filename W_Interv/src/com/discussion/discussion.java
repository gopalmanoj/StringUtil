package com.discussion;
import java.util.List;
import java.util.Scanner;

public class discussion {

	public static void main(String[] args) {
		
		String string="Hello90welcome78toindia50";
	Scanner sc=new Scanner(string); 
	sc.useDelimiter("[^0-9]+");
	
	while(sc.hasNext())
	{
		String str=sc.next();
	//	System.out.println(str); 
		int num=Integer.parseInt(str);
		System.out.println(num); 
	}
	
	
	}

}
