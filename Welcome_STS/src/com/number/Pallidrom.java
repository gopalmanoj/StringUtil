package com.number;

public class Pallidrom {

	public static void main(String[] args) {
		int num=131;
		int temp,sum=0,r;
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=sum*10+(r);
			num=num/10;
		}
System.out.println(sum);
	}

}
