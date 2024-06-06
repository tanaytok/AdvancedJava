package StringBuilders;

public class StringBuilderInsertDelete {
	
	public static void main(String[] args) {
		
		Object obj = "hello";
		String string = "goodbye";
		char[] array = {'a','b','c','d','e','f'};
		boolean booleanValue = true;
		int intValue = 7;
		double doubleValue = 33.345;
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.insert(0, obj);
		buffer.insert(0, " ");
		buffer.insert(0, string);
		buffer.insert(0, " ");
		buffer.insert(0, array, 3, 3);
		buffer.insert(0, " ");
		buffer.insert(0, booleanValue);
		buffer.insert(0, " ");
		buffer.insert(0, intValue);
		buffer.insert(0, " ");
		buffer.insert(0, doubleValue);
		buffer.insert(0, " ");
		
		System.out.println(buffer);
		
		buffer.deleteCharAt(2);
		buffer.delete(3, 5);
		System.out.println(buffer);
	}

}
