package W3StaticFunction;

/*Write a Java program to create a class called "MathUtility" with a static method 
 * add that takes two integers and returns their sum. 
 * 
 * Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".*/
public class MathUtility {

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int result = MathUtility.sum(10, 30);
		System.out.println(result);
	}

}
