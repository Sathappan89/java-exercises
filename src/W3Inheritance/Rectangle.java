package W3Inheritance;

public class Rectangle extends Shape {
	private double length;
    private double width;
    
    // Define the constructor that takes length and width as parameters
    public Rectangle(double length, double width) {
        // Assign the length parameter to the instance variable length
        this.length = length;
        // Assign the width parameter to the instance variable width
        this.width = width;
    }
    
    @Override
    public double getArea() {
        // Return the area of the rectangle (length * width)
        return length * width;
    }
    
}
