package StringBuilders;

public class StringBuilderCapacityLength {
	
	public static void main(String[] args) {
		
		StringBuilder buffer = new StringBuilder("Hello, How Are You?");
		System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n%n",buffer,buffer.length(),buffer.capacity());
		
		buffer.ensureCapacity(75); // Yeni kapasite atar.
		System.out.printf("New capacity = %d%n", buffer.capacity());
		
		buffer.setLength(10);
		System.out.printf("New Length = %d%nbuffer = %s%n", buffer.length(), buffer);
		
	}

}
