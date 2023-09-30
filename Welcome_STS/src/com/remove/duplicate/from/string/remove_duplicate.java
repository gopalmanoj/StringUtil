package com.remove.duplicate.from.string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class remove_duplicate {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("C:\\Users\\dj\\Desktop\\remove_krishna_mantra.txt");
		
		BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\dj\\Desktop\\krishna_mantra.txt")); 
		
		String line1=br1.readLine();
		
		while(line1 !=null)
		{
			boolean flag=false;
			BufferedReader br2=new BufferedReader(new FileReader("C:\\Users\\dj\\Desktop\\remove_krishna_mantra.txt"));
			String line2=br2.readLine();
			
			while(line2 !=null)
			{
				if(line1.equals(line2))
					{
					flag=true;
					
				break;
					}
				line2=br2.readLine();
			}
			
			 br1.close();
		        pw.close();
		          
		        System.out.println("File operation performed successfully");

		}

	}

}
