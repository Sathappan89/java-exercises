package JavaInheritanceConcept;

public class Car extends vehicle{


	public void start() {
		System.out.println("CAR Class----Start");
	}

	
	public void stop() {
		System.out.println("CAR Class----Stop");
	}
	
	public void list() {
		System.out.println("CAR Class----list");
	}

	@Override
	public void loading() {
		System.out.println("car----loading");
	}

	public static void ss() {
		System.out.println("car----static");
	}
	
	
	public final void testers() {
		System.out.println("test tester");
	}
	
	
}
