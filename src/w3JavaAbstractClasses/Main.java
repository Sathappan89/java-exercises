package w3JavaAbstractClasses;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Lion();
		a1.sound(); //@Override Method
		Animal.live();//Static method of super class
		a1.allAnimal();//Individual Method
		
		System.out.println("-----");
		Lion a2 = new Lion();
		a2.featureLion(); //Individal Method
		a2.sound();
		Animal.live();
	
		
		// Create an instance of Tiger and assign it to an Animal reference
        Animal tiger = new Tiger();
        // Call the sound method on the Tiger instance
        tiger.sound(); 
	}

}
