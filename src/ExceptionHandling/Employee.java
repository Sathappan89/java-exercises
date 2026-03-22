package ExceptionHandling;
public class Employee {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		//int i = 9 / 0; //Exception is unwanted code
		
		try {
			int i=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		System.out.println("bye");

	}

	public String name;

}