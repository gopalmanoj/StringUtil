import java.util.Scanner;

public class PAN_Number {

	public static void main(String[] args) {
		String string="Welcome12345@z";
		
		Scanner sc=new Scanner(string);
		//sc.useDelimiter("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		sc.useDelimiter("[^A-Z ^a-z]{9}");
		while(sc.hasNext())
		{
			String temp=sc.next();
			
			System.out.print(temp+" "); 
		}
	}

}
