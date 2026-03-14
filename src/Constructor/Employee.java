package Constructor;

public class Employee {

	public Employee() {
		System.out.println("Default 0 Param Const...");
	}

	public Employee(int i) {
		System.out.println("1 Param Constructor");
	}

	public Employee(int i, String p) {
		System.out.println("2 Param Constructor " + i + p);
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(10, " Sathappan");

	}

}
