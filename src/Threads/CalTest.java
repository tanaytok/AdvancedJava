package Threads;

public class CalTest {
	
	public static void main(String[] args) {
		
		CalculatorRunnable calcObj=new CalculatorRunnable(30000000000L);		
		Thread threadObj=new Thread(calcObj);
		threadObj.setName("MyThread-1");
		threadObj.start();
		
		while (threadObj.isAlive())
		{
			System.out.println(threadObj.currentThread().getName() + " is alive.");
		}
		
		System.out.println("Thread's work is completed...");
	}

}
