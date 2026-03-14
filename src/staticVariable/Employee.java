package staticVariable;

public class Employee {	
	static String company="Google";
	String name;
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println(Employee.company); //Google
		Employee.company="Microsoft";
		System.out.println(e1.company); //Microsoft
		System.out.println(e2.company); //Microsoft
		}
}