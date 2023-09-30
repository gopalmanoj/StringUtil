package thread.example;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

import javax.swing.text.DateFormatter;

class ShapeDemo extends Thread
{
	String name;
	CountDownLatch latch;
	LocalDate date=LocalDate.now();
	public ShapeDemo(String name, CountDownLatch latch,LocalDate date) {
		super();
		this.name = name;
		this.latch = latch;
		this.date=date;
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				latch.countDown();
	 System.out.println(Thread.currentThread().getName()+"\t"+latch.getCount()+"\t"+name+"\t"+date); 
	 Thread.sleep(1000); 
			}
			catch (Exception e) {
			System.out.println(e);
			}
		}
	}
}
public class CountdownLatchDemo {
public static void main(String args[]) throws Exception
{
	LocalDate d=LocalDate.now();
	CountDownLatch latch=new CountDownLatch(2); 
	ShapeDemo s1=new ShapeDemo("A_Name", latch,d);
	ShapeDemo s2=new ShapeDemo("B_Name", latch,d);
	
	s1.start();
	s2.start();
	
	latch.await();
	  
    // Main thread has started
    System.out.println(Thread.currentThread().getName() +
                       " has finished");
	
	
}
}
