package com.java8.flatmap;

public class start_with_1_string {

	public static void main(String[] args) {
		int[] array = {1234,1235,1236,43232,12443,5646334,1231412,6798796,8987};
		
		for(int i=0;i<array.length;i++)
		
		{	//System.out.print(array[i]+" ");
		
		
			String str=String.valueOf(array[i]);
		//System.out.print(str+" "); 
		
		
		if(str.startsWith("1"))
		{
			System.out.print(str); 	
		}
	}}

}
