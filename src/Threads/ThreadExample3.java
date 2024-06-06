package Threads;

public class ThreadExample3 extends Thread {

	ThreadExample2 th;
	
	public void run()
	{
		long value = Long.parseLong(th.text.getText());
		long sum = 0;
		
		for (long i=0; i<value; i++)
		{
			sum += value;
		}
		
		th.lblEmpty.setText("Result: " + sum);
		
	}
	
	public static void main(String[] args) {
		
		new ThreadExample3().start();
	}
	
}
