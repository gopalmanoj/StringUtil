package com.thread;

public class Example_1 {

	public static void main(String[] args)throws Exception
	{
		Runnable r=()->
		{
			try
			{
			for(int i=0;i<50;i++)
			{
			System.out.println("Welcome to the thread example");
			}
			Thread.sleep(2000); 
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		};
		Runnable r1=()->
		{
			System.out.println("Welcome to the thread example............"); 
		};
		
		Thread t=new Thread(r1);
		Thread t1=new Thread(r);
		t.setDaemon(true);
		System.out.println(t.isDaemon()); 
		t.start();
		t.join();
		t1.start();
	
		
	}

}
