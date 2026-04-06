package W3Inheritance;

public class Test2 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.drive();
		c1.typeOfVehicle();
		c1.typeOfCar();
		System.out.println("------------");
		Vehicle c2=new Car();
		c2.drive();
		c2.typeOfVehicle();
		System.out.println("------------");
		Vehicle c3=new Vehicle();
		c3.drive();
		c3.typeOfVehicle();
	}

}
