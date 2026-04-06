package w3InheritancePart2;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
        // Initialize the radius instance variable
        this.radius = radius;
    }
	
	@Override
    public double getPerimeter() {
        // Return the perimeter of the circle calculated as 2 * π * radius
        return 2 * Math.PI * radius;
    }
	
	@Override
    public double getArea() {
        // Return the area of the circle calculated as π * radius^2
        return Math.PI * radius * radius;
    }
}
