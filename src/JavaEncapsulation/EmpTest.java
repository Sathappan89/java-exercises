package JavaEncapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Sathappan");
		System.out.println(e1.getName()); // Sathappan

		e1.setAge(37);
		int myAge = e1.getAge();
		System.out.println(myAge); // 37

	}

}
