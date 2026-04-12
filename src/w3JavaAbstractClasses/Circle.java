package w3JavaAbstractClasses;

public class Circle extends Shape {

	private double r;
	
	public Circle(double r) {
		this.r=r;
	}
	
	@Override
	public double calculateArea() {
		double ans = r*r*3.14;
		return ans;
	}

	@Override
	public double calculatePerimeter() {
		double ans = 2*3.14*r;
		return ans;
	}

}
