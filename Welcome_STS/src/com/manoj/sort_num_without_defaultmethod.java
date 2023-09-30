package com.manoj;

public class sort_num_without_defaultmethod {
public static void main(String args[])
{
	
	int num=12345;
int reve=0;

	while(num>0)
	{
		
	int r=num%10;
		reve=reve*10+r;
		num=num/10;
	}
	System.out.println(reve);
}
}