package com.manoj;

public class Palidrome {
public static void main(String args[])
{
	int num=454; int temp=num, r=0;
	int sum=0;
	while(num>0)
	{
		r=num%10;
		sum=sum*10+r;
		num=num/10;
		
	if(temp==sum)
	{
		System.out.println("Given number\t"+temp+"\tis a palidrome number");
	}
	}
}
}
