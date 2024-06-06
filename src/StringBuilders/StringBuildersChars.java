package StringBuilders;

public class StringBuildersChars {
	
	public static void main(String[] args) {
		
		StringBuilder buffer = new StringBuilder("Hello There");
		System.out.printf("buffer = %s%n", buffer);
		System.out.printf("Character at 0: %s%nCharacter at 4: %s%n", buffer.charAt(0), buffer.charAt(4));
		
		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		System.out.println("The characters are: ");
		
		for (char character : charArray)
		{
			System.out.println(character + " ");
		}
		
		System.out.println();
		
		buffer.setCharAt(0, 'T');
		buffer.setCharAt(1, 'A');
		buffer.setCharAt(2, 'N');
		System.out.println("buffer = " + buffer);
		
		buffer.reverse();
		System.out.println("buffer = " + buffer);
	}

}
