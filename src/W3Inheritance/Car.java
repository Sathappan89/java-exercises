package W3Inheritance;

//Vehicle - Sub Class 
public class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Car - Repairing a car");
	}
	
	public static void typeOfCar() {
		System.out.println("Print the type of Cars");	
	}
}
