package ConstructorAssignments;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {
		this.length = 0.0;
		this.width = 0.0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		double result = length * width;
		return result;
	}

	public static void main(String[] args) {
		Rectangle R1=new Rectangle(10.0,20.2);
		double ans=R1.calculateArea();
		System.out.println(ans);
	}
}