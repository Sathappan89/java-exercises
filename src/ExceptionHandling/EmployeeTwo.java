package ExceptionHandling;

public class EmployeeTwo {
	
	String name;

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i=9/3;
			Employee obj=new Employee();
			obj = null;
			obj.name="naveen";
		}
		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}

	}

}
