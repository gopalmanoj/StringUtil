package com.demo;

import java.util.Arrays;

public class binarySearchkey {

	public static void indexplace(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==key)
			 
			 {
				 System.out.println(key+"\tis found at\t"+i);break;
			}
			 
			 
		 }

	}
	public static void main(String[] args) {
		 int arr[] = {10,20,30,40,50};  
		 indexplace(arr, 50); 
		 
		 int index=Arrays.binarySearch(arr, 300);
		 if(index<0)
		 {
			System.out.println("Number is not found"); 
		 }
		 else
		 {
			 System.out.println("Number is found at index\t"+index); 
		 }
		 for(int i=0;i<=10;i++)
		 {
			 System.out.println(fact(i)); 
		 }
	}
	
	public static int fact(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		else
		{
			return fact(n-1)+fact(n-2); 
		}
	}

}
