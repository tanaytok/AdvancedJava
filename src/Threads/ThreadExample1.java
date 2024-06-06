package Threads;

public class ThreadExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(1_000);
		System.out.println("Thread Name: " + Thread.currentThread().getName());
		Thread.sleep(1_000);
		
		System.out.println("Priority: " + Thread.currentThread().getPriority());
	}
	
}
