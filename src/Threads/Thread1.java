package Threads;

public class Thread1 extends Thread{
	
	public static void main(String[] args) {
		
		try
		{
			for (int i=0; i<5; i++)
			{
				System.out.println("Emek olmadan yemek olmaz.");
				Thread.sleep(1_000);
			}
		}
		
		catch (Exception e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Gülme komşuna gelir başına.");
		}
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Cemil olabilir mi?");
		}
	}

}
