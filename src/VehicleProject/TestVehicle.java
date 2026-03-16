package VehicleProject;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vv=new Vehicle();
		Car cc=new Car();
		Motorcycle mc=new Motorcycle();
		Truck tr=new Truck();
		
		tr.year=1989;
		System.out.println(tr.year);
		
		tr.accelerate();
		tr.stop();
		tr.start();

	}

}