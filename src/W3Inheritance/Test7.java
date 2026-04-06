package W3Inheritance;

public class Test7 {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2("Naveen", "testing", 20394, "QAManager");
		int id=e1.getEmployeeId();
		System.out.println(id); //20394
		
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " (" + e1.getEmployeeId() + ")");

		
	}

}
