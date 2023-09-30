package com.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Binary_search_Ex1 {
	
	static void binaryCheck(int num[],int temp)
	{
		Arrays.parallelSort(num);
		
		int nu=Arrays.binarySearch(num,temp);
		if(nu>0)
		{
			System.out.println("index place is\t"+nu);
		}
		else
		{
			System.out.println("index is\t"+nu); 
		}
	}
	
	private static void check(int[] arr, int toCheckValue)
    {
        // sort given array
        Arrays.sort(arr);
 
        // check if the specified element
        // is present in the array or not
        // using Binary Search method
        int res = Arrays.binarySearch(arr, toCheckValue);
 
      //  boolean test = res >= 0 ? true : false;
        
        if(res>0)
        {
        	System.out.println("index\t"+res);
        }
        
        else
        {
        	System.out.println("-1");  
        }
 
        // Print the result
      /* System.out.println("Is " + toCheckValue
                           + " present in the array: " + test);  */
    }

	public static void main(String[] args) {
		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
		 
        // Get the value to be checked
        int toCheckValue = 10;
 
        // Print the array
        System.out.println("Array: "
                           + Arrays.toString(arr));
 
        // Check if this value is
        // present in the array or not
        //check(arr, toCheckValue);
        
        binaryCheck(arr, toCheckValue); 

	}

}
