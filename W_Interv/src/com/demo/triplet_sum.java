package com.demo;

public class triplet_sum {

	public static void tripletSum(int num[],int target)
	{
		int sum=0;
		for(int i=0;i<num.length-2;i++)
		{
			for(int j=i+1;j<num.length-1;j++)
			{
				for(int k=j+1;k<num.length;k++)
				{
					
					if((num[i] + num[j] + num[k] )== target)
					{
						System.out.println(num[i]+"\t"+num[j]+"\t"+num[k]+"\t"+target); 
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
	int num[]= {0, -1, 2, -3, 1};
	tripletSum(num, 2); 

	}

}
