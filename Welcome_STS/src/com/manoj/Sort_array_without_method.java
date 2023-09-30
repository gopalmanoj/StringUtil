package com.manoj;

public class Sort_array_without_method {

	static void sortElement(int num[])
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
	public static void main(String args[])
	{
		int num[]= {9,4,6,2,7,8,1,3};
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"\n ");
		}
		
		System.out.println("............................................");
		
		sortElement(num); 
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}
