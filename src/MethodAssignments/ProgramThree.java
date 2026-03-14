package MethodAssignments;

/*Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.*/
public class ProgramThree {

	public static double Circumference(int r) {
		double c = 2 * 3.14 * 4;
		return c;
	}

	public static double AreaOfCricle(int r) {
		double area = 3.14 * r * r;
		return area;
	}

	public static void main(String[] args) {
		double result1 = ProgramThree.Circumference(7);
		double result2 = ProgramThree.AreaOfCricle(5);
		System.out.println(result1);
		System.out.println(result2);
	}

}
