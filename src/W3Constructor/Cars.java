package W3Constructor;

/*Write a Java program to create a class called Car with instance variables make, model, and year. 
 * Implement a parameterized constructor that initializes these variables and 
 * assigns default values if not provided. Print the values of the variables.*/
public class Cars {

	private String make;
	private int model;
	private int year;

	public Cars(String make, int model, int year) {

		if (make == null || make.isEmpty()) {
			this.make = "making new";
		} else {
			this.make = make;
		}
		if (model <= 0) {
			this.model = 0;
		} else {
			this.model = model;
		}
		if (year <= 0) {
			this.year = 0;
		} else {
			this.year = year;
		}
	}

	public static void main(String[] args) {
		Cars c1 = new Cars(null, -19, 1992);
		System.out.println(c1.make + " " + c1.model + " " + c1.year);

	}

}
