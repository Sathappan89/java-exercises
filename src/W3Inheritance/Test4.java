package W3Inheritance;

public class Test4 {

	public static void main(String[] args) {
		Employee e1= new Employee(5000);
		e1.work();
		System.out.println(e1.getSalary());
		
		HRManager hr=new HRManager(7000);
		hr.work();
		System.out.println(hr.getSalary());
		hr.addEmployee();
		
		Employee e2=new HRManager(9000);
		System.out.println(e2.getSalary());
	}

}
