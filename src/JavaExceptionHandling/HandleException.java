package JavaExceptionHandling;

public class HandleException {

	public static void main(String[] args) {
		

		try {
			int a=9/0;
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			//throw new ARThrowException("ZERO Division is not allowed");
		}

		System.out.println("test");
	}

}
