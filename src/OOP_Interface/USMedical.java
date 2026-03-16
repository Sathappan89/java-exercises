package OOP_Interface;

public interface USMedical extends WHO {

	// abstract method:
	// no method body, only method declaration
	// only method prototype
	// can not create the object of the interface

	public void dentalServices();

	public void entServices();

	public void physioServices();

	public void emergencyServices();
	
	public void orthoServices();
	
	//1.after JDK1.8, two major changes:
	//can not overridden
	public  static void  billing() {
		System.out.println("US Medical");
	}
	
	//2. default method with body: not a static
	//can be overridden
	default void medicalPolicy() {
		System.out.println("USM---medical policy");
	}
	
}
