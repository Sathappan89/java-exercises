package JavaStaticMembers;

/*Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000. 
 * Print the value of 'initialValue' before and after creating an instance of "Initializer".*/
public class Initializer {

	// Declare a static variable initialValue
	static int initialValue;

	// Static block to initialize initialValue
	static {
		initialValue = 1000;
		System.out.println("Static block: initialValue initialized to " + initialValue);
	}

	public static void main(String[] args) {
		Initializer in = new Initializer();
		System.out.println("After creating an instance : initialValue = " + Initializer.initialValue);

	}

}
