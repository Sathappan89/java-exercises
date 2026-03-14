package ConstructorAssignments;

public class Car {

	// Instance Variables:
	private String make;
	private String model;
	private int Year;

	public Car(String make, String model, int Year) {
		this.make = make;
		this.model = model;
		this.Year = Year;
	}

	//Default constructor
	
	public Car() {
		this.make="Unknown";
		this.model="Unknown";
		this.Year=-1;
	}
	
	//Getter
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return Year;
	}
	
	public static void main(String[] args) {
		Car c1=new Car("Toyota","Camry",2020);
		Car c2=new Car("Honda","Accord",2019);
		Car c3=new Car();
		
		System.out.println("Car 1:");
		System.out.println("Make: " + c1.getMake());
		System.out.println("Model: " + c1.getModel());
		System.out.println("Year: " + c1.getYear());
		System.out.println();
		
		System.out.println("Car 2:");
		System.out.println("Make: " + c2.getMake());
		System.out.println("Model: " + c2.getModel());
		System.out.println("Year: " + c2.getYear());
		System.out.println();
		
		System.out.println("Car 3:");
		System.out.println("Make: " + c3.getMake());
		System.out.println("Model: " + c3.getModel());
		System.out.println("Year: " + c3.getYear());
		
	}

}
