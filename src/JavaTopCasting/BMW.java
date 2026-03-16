package JavaTopCasting;

public class BMW extends Car{

	@Override
	public void start() {
		System.out.println("BMW --Starting");
	}
	@Override
	public void stop() {
		System.out.println("BMW --Stoping");
	}
	@Override
	public void loading() {
		System.out.println("BMW --loading");
	}
	
	public void bmwCar() {
		System.out.println("BMW --loading");
	}
	
}
