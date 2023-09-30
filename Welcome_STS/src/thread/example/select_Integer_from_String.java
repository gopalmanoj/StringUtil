package thread.example;

import java.util.Scanner;

public class select_Integer_from_String {

	public static void main(String[] args) {
		String string="Hello19worldcup15ishapping78Bihar57IndiaAsia !";
		String detail="Welcome to the Indian state Bihar Madhubani district Sothigaon -10 Baluwaha -20 tol"
				+ "I 30 am 40 Manoj 50 Kumar 60 Mishra 70 citizen of 80 this 90 village";
		
		Scanner sc=new Scanner(string);
		
		Scanner scanner=new Scanner(detail);
		
		sc.useDelimiter("[^0-9]");
		
		while(sc.hasNext())
		{
			String temp=sc.next();
			
			System.out.print(temp+" "); 
		}
		//scanner.useDelimiter("[^0-9]+");
		scanner.useDelimiter("[^A-Z a-z]+");
		System.out.println("\n_________________________________________________________________\n");
		while(scanner.hasNext())
		{
			String num=scanner.next();
			
			System.out.print(num+" "); 
		}
		
		
		
	}

}
