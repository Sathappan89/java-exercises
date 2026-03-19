package java_Constructor;

/*Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
Print the values of the variables*/

public class cat_InstanceVariables {

	private String name;
	public int age;

	public cat_InstanceVariables() {

		this.name = "Unknown";
		this.age = 0;
	}

	public String getName() {
		return name;
	}

	public int age() {
		return age;
	}

	public static void main(String[] args) {
		cat_InstanceVariables c = new cat_InstanceVariables();
		System.out.println(c.getName());
		System.out.println(c.age());
	}

}
