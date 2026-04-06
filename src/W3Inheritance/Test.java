package W3Inheritance;

public class Test {

	public static void main(String[] args) {
		Animal an = new Cat();
		an.makeSound(); //Override method
		an.UniversalAnimal(); //Inherited method
		System.out.println("------------------");
		Cat ans = new Cat();
		ans.makeSound();//Override method
		ans.testing(); //Individual method 
		ans.UniversalAnimal(); // inherited method
		System.out.println("------------------");
		
	}

}
