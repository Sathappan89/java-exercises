package VehicleProject;

public class Motorcycle extends Vehicle {
	
	public String engineType;
	
	public void wheelie() {
		System.out.println("Wheelie");
	}
	@Override
	public void start() {
		System.out.println("Start the Motorcycle");
	}
	
	
}
