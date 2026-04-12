package w3JavaAbstractClasses;

public class Main2 {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.23);
		double res = c1.calculateArea();
		double res2 = c1.calculatePerimeter();
		System.out.println(res);
		System.out.println(res2);
		System.out.println("-------------------");

		Triangle t1 = new Triangle(3.3, 4.4);
		double rest = t1.calculateArea();
		
		Triangle t2 = new Triangle(3.01);
		double rest2 = t2.calculatePerimeter();
		
		System.out.println(rest);
		System.out.println(rest2);
	}

}
