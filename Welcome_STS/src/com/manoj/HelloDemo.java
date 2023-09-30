package com.manoj;

import java.util.HashMap;

public class HelloDemo {
	
	public static void sortdemo(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=1;j<num.length;j++)
			{
				if(num[j-1]>num[j])
				{
				int temp=num[j-1];
				num[j-1]=num[j];
				num[j]=temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int num[]= {7,3,6,9,5,4,2};
		
		sortdemo(num);
		for(int i=0;i<num.length;i++)
		{
		System.out.println(num[i]);
					}
		
		String string="aabbccdddaccansb";
		

	}

}
