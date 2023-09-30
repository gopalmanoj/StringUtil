package com.manoj;

public class Armongstrome_number {
public static void main(String args[])
{
	int num=1531;
	int temp=num; int r,sum=0;
	
	while(num>0)
	{
		r=num%10;
		sum=(sum+r*r*r);
		num=num/10; 
		
		if(temp==sum)
		{
			System.out.print("Given number is armongtrome no");
		}
		else
		{
			System.out.print("Given number is not armongtrome no");
			break;
		}
	}
}
}
