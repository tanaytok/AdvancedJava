package Strings;

public class StringMiscellaneous {
	
	public static void main(String[] args) {
		
		String s1 = "Hello There";
		char[] charArray = new char[5];
		
		System.out.printf("s1 = %s\n", s1);
		
		System.out.printf("Length of s1: %d\n", s1.length());
		
		// Reversed String: 
		System.out.println("The string reversed is: ");
		for (int i = s1.length()-1; i >= 0; i--)
		{
			System.out.printf(s1.charAt(i) + " ");
		}
		
		System.out.println();
		
		//Copy characters s1 to charArray:
		s1.getChars(0, 5, charArray, 0);
		for(char karakter : charArray)
		{
			System.out.printf(karakter + " ");
		}
	}

}
