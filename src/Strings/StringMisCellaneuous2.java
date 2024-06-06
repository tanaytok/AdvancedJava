package Strings;

public class StringMisCellaneuous2 {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "GOODBYE";
		String s3 = "    spaces    ";
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n", s1, s2 ,s3);
		
		// REPLACE
		System.out.printf("Replace 'l' with 'L' in s1: %s\n\n", s1.replace('1', 'L'));
		
		// UPPER LOWER:
		System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
		System.out.printf("s1.toLowerCase() = %s%n", s1.toLowerCase());
		
		// TRIM
		System.out.printf("s3 after trim = \"%s\"\n\n", s3.trim());
		
		// toCharArray Methodu:
		char[] charArray = s1.toCharArray();
		System.out.println("s1 as character array = ");
		for(char karakter : charArray)
		{
			System.out.println(karakter);
		}
		
		System.out.println();
		
		// SUBSTRING Methodu:
		
		String letters = "abcdefghijklmabcdefghijklm";
		
		System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(0));
	}

}
