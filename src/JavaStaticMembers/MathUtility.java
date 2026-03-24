package JavaStaticMembers;

/*Write a Java program to create a class called "MathUtility" 
 * with a static method add that takes two integers and returns their sum. 
 * Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".*/

public class MathUtility {

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		MathUtility m1 = new MathUtility();
		int test = m1.sum(25, 15);
		System.out.println(test); //40
	}

}
