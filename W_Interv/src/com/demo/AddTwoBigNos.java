package com.demo;

public class AddTwoBigNos {
	
	public static String AddTwoNos(String string1, String string2)
	{
		if(string1.length()>string2.length())
		{
			String t=string1;
			string1=string2;
			string2=t;
		}
		String str="";
		int n1=string1.length(),n2=string2.length();
		int diff=n2-n1;
		int carry=0;
		
		for(int i=n1-1;i>=0;i--)
		{
			int sum=((char)(string1.charAt(i)-'0')+(char)(string2.charAt(i+diff)-'0')+carry);
			str+=(char)(sum%10+'0');
			carry=sum/10;
		}
		for(int i=n2-n1-1;i>=0;i--)
		{
			int sum=((char)(string2.charAt(i)-'0')+carry);
			str+=(char)(sum%10+'0');
			carry=sum/10;
		}
		if(carry>0)
		{
			str+=(char)(carry+'0');
		}
		return new StringBuilder(str).reverse().toString(); 
	}
	
	public static void main(String[] args) {
		String string1="99999999999999999999999999999999999999999999999999";
		String string2="99999999999999999999999999999999999999999999999999";
		System.out.println(AddTwoNos(string1, string2)); 
		
		

	}

}
