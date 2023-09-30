 package com.custome.ArrayList;

import java.util.ArrayList;

public class Custom_2_Arraylist {
	int size=6;
	
	class Product
	{
		int pid;   
		String pname;   
		char pavailability;   
		double pprice;   
		float prating;
		public Product(int pid, String pname, char pavailability, double pprice, float prating) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.pavailability = pavailability;
			this.pprice = pprice;
			this.prating = prating;
		}
		
	}
	
	public void AddElement(int pid[], String pname[], char pavailability[], double pprice[], float prating[])
	{
		ArrayList<Product> list=new ArrayList<Custom_2_Arraylist.Product>();
		for(int i=0;i<size;i++)
		{
			list.add(new Product(pid[i], pname[i], pavailability[i], pprice[i], prating[i]));  
		}
		displayElement(list);
	}
	
	public void displayElement(ArrayList<Product> p)
	{
		Product pp;
	 for(int i=0;i<p.size();i++)
	 {
		pp=p.get(i); 
		
		System.out.println(pp.pid+"\t"+pp.pname+"\t"+pp.pavailability+"\t"+pp.pprice+"\t"+pp.prating);
	 }
	 
	}

	public static void main(String[] args) {
		int pid[] = {21823, 89774, 34007, 12098, 45098, 10067};   
		String pname[] = {"HP Laptop", "Inverters", "Volats AC", "iPhone 11", "CanonDSLR", "SonyLEDTV"};   
		char pavailability[] = {'Y', 'Y', 'N', 'Y', 'Y', 'N'};   
		double pprice[] = {31987, 16900, 28000, 99000, 67570, 60500};   
		float prating[] = {4.5f, 4.0f, 4.7f, 4.5f, 3.9f, 4.0f};  
		
		Custom_2_Arraylist c=new Custom_2_Arraylist();
		
		c.AddElement(pid, pname, pavailability, pprice, prating); 

	}

}
