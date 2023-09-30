package com.demo;

public class DiffOddEven {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		int even_sum=0,odd_sum=0;
		for(int i=0;i<num.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(num[i]+" "); 
				even_sum+=num[i];
			}
		}
		System.out.println();
		System.out.println("Even sum\t"+even_sum); 
		System.out.println("____________________________________________");
		
		for(int i=0;i<num.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(num[i]+" "); 
				odd_sum+=num[i];
			}
		}
		System.out.println();
		System.out.println("Odd sum\t"+odd_sum);
		
		int diff=odd_sum-even_sum;
		System.out.println("Diff\t"+diff); 

	}

}
