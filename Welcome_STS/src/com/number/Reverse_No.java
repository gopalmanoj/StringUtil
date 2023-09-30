package com.number;

public class Reverse_No {

	public static void main(String[] args) {
		int num=12345;
		int temp,r;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			System.out.println("Reverse No\t"+r); 
		}
	}

}
