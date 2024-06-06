package Strings;

public class StringStartEnd {
	
	public static void main(String[] args) {
		
		String[] strings = {"started","starting","ended","ending"};
		
		// "st" ile başlayan strings:
		System.out.println("Test method startsWith()");
		for (String string : strings)
		{
			if (string.startsWith("st"))
			{
				System.out.println(string + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("Test method startsWith starting from second index of string");
		for (String myValue : strings)
		{
			if (myValue.startsWith("art",2))
			{
				System.out.println(myValue + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("Test method endsWith()");
		for (String last : strings)
		{
			if (last.endsWith("ed"))
			{
				System.out.println(last + " ");
			}
		}
	}

}
