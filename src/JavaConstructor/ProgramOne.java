package JavaConstructor;

public class ProgramOne {
	/*
	 * Write a Java program to create a class called "Cat" with instance variables
	 * name and age. Implement a default constructor that initializes the name to
	 * "Unknown" and the age to 0. Print the values of the variables.
	 */

	public String catName;
	public int catAge;

	ProgramOne() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {

		ProgramOne c = new ProgramOne();
		c.catAge = 0;
		c.catName = "unknown";
		System.out.println(c.catAge + " " + c.catName);

	}

}
