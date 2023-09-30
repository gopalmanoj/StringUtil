package com.demo;

import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
		int num[]= {1,9,3,6,5,4,7,8};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					int temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}System.out.println(num[0]);break;
			//}
		}
		
	}

}
