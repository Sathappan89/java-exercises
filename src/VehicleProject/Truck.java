package VehicleProject;

public class Truck extends Vehicle{
	
	public String cargoCapacity;
	
	public void loadCargo() {
			System.out.println("loadCargo");
	}

	@Override
	public void start() {
		System.out.println("Start the truck");
	}
}
