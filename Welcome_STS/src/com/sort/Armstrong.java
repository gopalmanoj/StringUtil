package com.sort;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int sum=0,temp,r;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			
			num=num/10;
		
		System.out.println(r); 
		}
		if(temp==sum)
		{
			System.out.println(temp+"\tis Armstrong No");
		}
		else
		{
			System.out.println(temp+"\tis not Armstrong");
		}

	}

}
