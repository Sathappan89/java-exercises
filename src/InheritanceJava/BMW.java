package InheritanceJava;

public class BMW extends Car {

	@Override // Method Overriding
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto Parking");
	}

}