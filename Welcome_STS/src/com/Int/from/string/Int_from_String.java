package com.Int.from.string;

import java.util.Scanner;

public class Int_from_String {

	public static void main(String[] args) {
		String string="Hello19worldcup15ishapping78Bihar57IndiaAsia !";
		String detail="Welcome to the Indian state Bihar Madhubani district Sothigaon -10 Baluwaha -20 tol"
				+ "I 30 am 40 Manoj 50 Kumar 60 Mishra 70 citizen of 80 this 90 village";
		
		Scanner sc=new Scanner(string);
		
		Scanner scanner=new Scanner(detail);
		
		sc.useDelimiter("[^0-9]+");
		
		while(sc.hasNext())
		{
			String temp=sc.next();
			
			System.out.print(temp+" "); 
		}
		scanner.useDelimiter("[^0-9]+");
		//scanner.useDelimiter("[^A-Z a-z]+");`
		System.out.println("\n_________________________________________________________________\n");
		int sum=0;
		while(scanner.hasNext())
		{
			String intt=scanner.next();	
			
			int num=Integer.parseInt(intt);
			//System.out.println("Selected Ints Are\t"+intt); 
			
			sum=sum+num;
			System.out.println("Ints Are\t"+num);
			
			//System.out.println("Total sum\t"+sum);
	}
		
		System.out.println("Total sum\t"+sum);

}
}