package W3Constructor;

public class Singleton {
/*In a Singleton Pattern, the constructor is made private to prevent external instantiation, ensuring that only one instance of the class can ever be created.*/
	private static Singleton instance;

	private Singleton() {
		// private constructor
		System.out.println("Singleton instance created.");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton(); // constructor called here
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton s1 = new Singleton();
		Singleton s2 = new Singleton();

	}

}
