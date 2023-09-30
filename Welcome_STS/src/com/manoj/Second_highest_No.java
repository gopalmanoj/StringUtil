package com.manoj;

public class Second_highest_No {

	static int secondlargest(int num[], int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=0;j<total;j++)
			{
				if(num[i]<num[j])
				{
					int temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
		}
		return num[total-3];
	}
	public static void main(String[] args) {
		int num[]= {6,12,18,90,75,55};
		
		System.out.println(secondlargest(num, 6)); 
	}

}
