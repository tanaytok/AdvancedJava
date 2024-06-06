package Threads;

public class CalculatorRunnable implements Runnable {
	
	private long value;
	
	public CalculatorRunnable(long value)
	{
		this.value = value;
	}

	@Override
	public void run() 
	{
		long startTime = System.currentTimeMillis();
		long sum = 0;
		
		for (long i=0; i<value; i++)
		{
			sum = sum + value;
		}
		
		long takenTime = System.currentTimeMillis() - startTime;
		System.out.println("Elapsed time: " + takenTime + "for thread " + Thread.currentThread().getName());
		System.out.println(" Sum: " + sum);
	}

}
