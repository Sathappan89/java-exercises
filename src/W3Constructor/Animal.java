package W3Constructor;

public class Animal {
	
	private static Animal animal;
	
	private Animal() {
		// private constructor
		System.out.println("Singleton instance created.");
	}

	public static Animal getObj() {
		if(animal==null) {
			animal = new Animal();
		}
		
		return animal;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();

	}

}