package JavaStaticMembers;

/*Write a Java program to create a class called "Counter" with a static variable count. 
 * Implement a constructor that increments count every time an object is created. 
 * Print the value of count after creating several objects.*/
public class Counter {

	// Static variable to keep track of the count of instances
	private static int count = 0;

	// Constructor increments the static variable count
	public Counter() {
		System.out.println(++count);
	}

	// Static method to get the value of count
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		System.out.println("Count: " + Counter.getCount());
	}
}
