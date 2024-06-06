package Threads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Thread2 extends Thread{
	
	public void run()
	{
		Random r = new Random();
		int firstNumber=r.nextInt(9);
		int secondNumber=r.nextInt(9);
		int sum=firstNumber-secondNumber;
		
		System.out.println(firstNumber+ "-" +secondNumber+ "=" +sum);
		String message=firstNumber+ "-" +secondNumber+ "=" +sum;
		
		try
		{
			File f = new File("C:\\Users\\Huawei\\Desktop\\3. Sınıf\\Java\\Final_İleri_Java\\src\\MyFile");
			FileWriter fWriter = new FileWriter(f);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.append(message + "\n");
			bWriter.close();
		}
		
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
