package JavaInheritanceConcept;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW Class----Start");
	}

	@Override
	public void stop() {
		System.out.println("BMW Class----Stop");
	}
	
	public void bmwseries() {
		System.out.println("BMW Class----Series");
	}
	
	public void auditest() {
		Audi au=new Audi();
		au.auditesting();
	}
	
	

}
