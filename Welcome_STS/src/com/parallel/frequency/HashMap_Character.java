package com.parallel.frequency;

import java.util.LinkedHashMap;

public class HashMap_Character {
	
static void sortint(int num[])
{
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			if(num[j]>num[i])
			{
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		
		
		}
		System.out.println(num[i]);
	}
}
	public static void main(String[] args) {
		int num[]= {6,3,9,7,5,1,8};
		sortint(num);
	}

}
