package JavaTopCasting;

public class Car extends Vehicle {
	
	
		@Override
		public void start() {
			System.out.println("CAR --Starting");
		}
		
		public void stop() {
			System.out.println("CAR --Stoping");
		}
		
		public void loading() {
			System.out.println("CAR --loading");
		}
		
		public void engine() {
			System.out.println("CAR --engine");
		}
}


