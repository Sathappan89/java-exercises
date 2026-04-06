package W3Inheritance;

public class Employee2 extends Person{
	 // Private instance variable for employee ID
    private int employeeId;
    
    // Private instance variable for job title
    private String jobTitle;
	public Employee2(String FirstName,String LastName, int employeeId, String jobTitle) {
		super(FirstName,LastName);
		this.employeeId=employeeId;
		this.jobTitle=jobTitle;
	}
	// Public method to get the employee ID
    public int getEmployeeId() {
        return employeeId;
    }
 // Override the getLastName method from the superclass (Person)
    @Override
    public String getLastName() {
        // Return the last name from the superclass combined with the job title
        return super.getLastName() + ", " + jobTitle;
    }
}
