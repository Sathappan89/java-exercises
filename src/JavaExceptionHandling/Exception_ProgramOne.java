package JavaExceptionHandling;

public class Exception_ProgramOne {

	public static int divideNumber(int a, int b) {

		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			// .printStackTrace();
			throw new ARThrowException("Division by zero is not allowed");
		} finally {
			System.out.println("End Program"); // always runs
		}

	}

	public static void main(String[] args) {

		int result = Exception_ProgramOne.divideNumber(10, 0);
		System.out.println(result);

	}

}
