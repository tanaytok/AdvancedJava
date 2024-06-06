package Strings;

public class StringIndexMethods {
	
	public static void main(String[] args) {
		
		String letters = "abcdefghjklmabcdefghjklm";

		// indexOf Examples:
		
		System.out.println("'c' is located at index: " + letters.indexOf('c'));
		
		System.out.println("'a' is located at index: %d\n" + letters.indexOf('a',1));
		
		System.out.println("'$' is located at index: " + letters.indexOf('$'));
		System.out.println();
		
		// lastindexOf Examples:
		
		System.out.println("Last 'c' is located at index: " + letters.lastIndexOf('c'));
		
		System.out.println("Last 'a' is located at index: " + letters.lastIndexOf('a',13));
		System.out.println();
		
		// lastindexOf to find a substring in a string
		
		System.out.println("\"def\" is located at index : " + letters.indexOf("def"));
		
		System.out.println("\"def\" is located at index: " + letters.indexOf("def",7));
		
		// lastindexOf to find a substring in a string
		
		System.out.printf("Last \"def\" is located at index %dn", letters.lastIndexOf("def"));
		
		System.out.printf("Last \"hello\" is located at index %d%n", letters.lastIndexOf("hello"));
		
		
	}
	

}
