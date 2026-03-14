package ConstructorAssignments;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getter Methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee employee = new Employee(101, "John", 50000.00);

		System.out.println("Employee Information:");

		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: $" + employee.getSalary());

		double raisePercentage = 0.10;
		double raiseAmount = employee.getSalary() * raisePercentage;
		double newSalary = employee.getSalary() + raiseAmount;
		employee.setSalary(newSalary);

	}

}
