package Threads;

public class P_C_Test {
	
	public static void main(String[] args) {
		
		Producer p = new Producer();
		p.start();
		
		Consumer c = new Consumer(p);
		c.start();
	}

}
