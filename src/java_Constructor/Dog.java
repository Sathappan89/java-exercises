package java_Constructor;
/*Write a Java program to create a class called Dog with instance variables name and color. 
 * Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
 * Print the values of the variables.*/

public class Dog {

	public String name;
	public String color;

	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Vivii", "White");
		System.out.println(d1.getName() + " " + d1.getColor());
		d1.setColor("test");
		d1.setName("faster");
		System.out.println(d1.getName() + " " + d1.getColor());

	}

}
