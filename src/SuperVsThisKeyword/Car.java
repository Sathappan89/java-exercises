package SuperVsThisKeyword;

public class Car {

	int min_speed = 100;
	
	
	public Car() {
		System.out.println("Car class default constructor");
	}
	
	public Car(int i) {
		System.out.println("Car class single param " + i);
	}
	
	public Car(int i,int j) {
		System.out.println("Car class double param" + i + j);
	}

	public void start() {
		System.out.println("Car----Start");
	}

	public void stop() {
		System.out.println("Car----Stop");
	}

}
