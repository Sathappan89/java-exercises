package W3Constructor;

public class Rectangle {
/*Write a Java program to create a class called Rectangle with instance variables length and width. 
 * Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. 
 * Print the values of the variables.*/
	
	public double length;
	public double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	public Rectangle(Rectangle rectangle) {
		this.length=rectangle.length;
		this.width=rectangle.width;
	}
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(12.5,7.7);
		System.out.println(rect1.length);
		System.out.println(rect1.width);
		Rectangle rect2 = new Rectangle(rect1);
		System.out.println(rect2.length);
		System.out.println(rect2.width);
	}

}
