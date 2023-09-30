package com.armongrum.pallidrum;

public class Aemon {
	
	
	public static void main(String[] args) {
		int num=1538,sum=0,temp=num,r;
		
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
		
		num=num/10;
		
		
		}
if(sum==temp)
{
	System.out.println(temp+"\t Is Armonstrum");
}
else
{
	System.out.println(temp+"\t Is not Armonstrum");
}
	}

}
