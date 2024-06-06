package StringBuilders;

public class StringBuilderAppend {
	
	public static void main(String[] args) {
		
		Object obj = "hello";
		String string = "goodbye";
		char[] array = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		int intValue = 7;
		double doubleValue = 33.333;
		
		StringBuilder lastBuffer = new StringBuilder("last buffer");
		StringBuilder buffer = new StringBuilder();
		
		buffer
		.append(obj)
		.append("\n")
		.append(string)
		.append("\n")
		.append(array,0,3)
		.append("\n")
		.append(booleanValue)
		.append("\n")
		.append(intValue)
		.append("\n")
		.append(doubleValue)
		.append("\n")
		.append(lastBuffer);
		
		System.out.println(buffer);
		
	}

}
