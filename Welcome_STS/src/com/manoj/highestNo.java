package com.manoj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class highestNo {
	
	static int getlargest(int num[], int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=0;j<total;j++)
			{
				if(num[i]<num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		return num[total-1];
	}
	public static void main(String args[])
	{
		int num[]= {8,90,5,67,55,34,97}; 
		
		System.out.println(getlargest(num, 7));
		
		
	}

}
