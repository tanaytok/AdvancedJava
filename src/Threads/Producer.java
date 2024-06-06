package Threads;

import java.util.ArrayList;
import java.util.Random;

public class Producer extends Thread{

	private int maxSize=5;
	private ArrayList<String> list= new ArrayList<>();
	private String[] sentence= {"What is your name?","Ne yapıyorsun?","Men danişcu hestem",
			"Where are you from", "Bugün hava çok güzel","Ismi men gulay est."};
	
	public Producer()
	{
		
	}
	
	public void run()
	{
		try
		{
			produce();
		}
		
		catch(Exception e)
		{
			System.out.println("Error:" + e.getMessage());
		}
	}
	
	public synchronized void produce() throws InterruptedException
	{
		Thread.sleep(1_000);
		Random r=new Random();
		
		while(list.size()==maxSize)
		{
			wait();
		}
		
		String data=sentence[r.nextInt(6)];
		list.add(data);
		
		System.out.println(Thread.currentThread().getName()+ "produce data:"+data);
		notify();
	}
	
	public synchronized void consume() throws InterruptedException
	{
		
		while(list.isEmpty())
		{
			wait();
		}
		
		String data=list.remove(0);		
		System.out.println(Thread.currentThread().getName()+ "extract data :"+data);
		notify();
		
	}
	
	
	

}

