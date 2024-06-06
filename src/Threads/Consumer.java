package Threads;

public class Consumer extends Thread{
	
	private Producer producer;
	
	public Consumer(Producer p)
	{
		this.producer = p;
	}
	
	public void run()
	{
		try
		{
				producer.consume();
				Thread.sleep(1_000);
		}
		
		catch (Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
