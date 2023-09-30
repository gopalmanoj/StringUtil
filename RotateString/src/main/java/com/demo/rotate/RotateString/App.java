package com.demo.rotate.RotateString;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StringUtils s=new StringUtils();
    	String string="amazon";
    	
    	String str=s.rotate(string, 1);
    	
    	System.out.println(str); 

    	
    String str4=s.rotate(string, 4);
    	
    	System.out.println(str4); 
    	
    String r1=s.repeat(string, 2);

    String r2=s.repeat(string, "r", 3);
    System.out.println("===================================================================================");
    System.out.println(r1);

    System.out.println("===================================================================================");
    System.out.println(r2); 

    }
}
