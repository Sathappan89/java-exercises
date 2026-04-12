package w3JavaAbstractClasses;

public class Triangle extends Shape {
	
	private double base;
	private double height;
	private double r;

	public Triangle(double r) {
		this.r=r;
	}
	
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	
	

		@Override
		public double calculateArea() {
			double ans = 0.5*base*height;
			return ans;
		}
	
		@Override
		public double calculatePerimeter() {
			double ans = 2*3.14*r;
			return ans;
		}

}
