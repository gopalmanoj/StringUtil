package com.custome.ArrayList;

import java.util.ArrayList;

public class Custom_ArrayList 
{
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
	public void addElement(int pid[],String name[],char pavailability[],float prating[])
	{
		ArrayList<Product> arrList=new ArrayList<Custom_ArrayList.Product>();
		for(int i=0;i<size;i++)
		{
			arrList.add(new Product(pid[i], name[i], pavailability[i], i, prating[i])); 
		}
		displayElement(arrList);
	}
	public void displayElement(ArrayList<Product> p)
	{
		System.out.println("Product ID" + "   Product Name" + "     Product Availability" + "    Product Price" + "   Product Rating");   
		System.out.println("-------------------------------------------------------------------------------------");      
		for(int i=0;i<p.size();i++)
		{
			Product pp=p.get(i);
			System.out.println(pp.pid+"\t"+pp.pname+"\t"+pp.pavailability+"\t"+pp.pprice+"\t"+pp.prating); 
		}
	}
	

	public static void main(String[] args) {
		int pid[] = {21823, 89774, 34007, 12098, 45098, 10067};   
		String pname[] = {"HP Laptop", "Inverters", "Volats AC", "iPhone 11", "CanonDSLR", "SonyLEDTV"};   
		char pavailability[] = {'Y', 'Y', 'N', 'Y', 'Y', 'N'};   
		double pprice[] = {31987, 16900, 28000, 99000, 67570, 60500};   
		float prating[] = {4.5f, 4.0f, 4.7f, 4.5f, 3.9f, 4.0f};  
		
		Custom_ArrayList ca=new Custom_ArrayList();
	ca.addElement(pid, pname, pavailability, prating);
	}

}
