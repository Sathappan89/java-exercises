package W3Constructor;

//Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:
/*
 * One constructor takes int parameters.
 * Another constructor takes double parameters.
 * Print the values of the variables for each constructor.
 * 
 * */
public class Point {
	
	public int x;
	public int y;
	
	public Point(double x,double y) {
		//this.golbal variable = local variable
		this.x=(int) x;
		this.y=(int) y;
		System.out.println("up casting");
	}

	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("int value");
	}
	
	public static void main(String[] args) {
		Point p1=new Point(10,20);
		System.out.println(p1.x);
		System.out.println(p1.y);
		
		Point p2=new Point(30.9,40.0);
		System.out.println(p2.x);
		System.out.println(p2.y);
	}

}
