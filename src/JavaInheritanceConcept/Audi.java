package JavaInheritanceConcept;

public class Audi extends Car{
	
	@Override
	public void start() {
		System.out.println("Audi Class----Start");
	}

	@Override
	public void stop() {
		System.out.println("Audi Class----Stop");
	}

	public void auditesting() {
		System.out.println("Audi Class----test");
	}
	
}
