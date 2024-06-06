package Threads;

public class Cal1 {

	public static void main(String[] args) throws InterruptedException{
		
		CalculatorRunnable calObj = new CalculatorRunnable(30000000000L);
		Thread threadObj = new Thread(calObj);
		threadObj.start();
		threadObj.join(100);
		System.exit(0);
		
	}
}
