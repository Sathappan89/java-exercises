package MethodAssignments;

/*Define two methods to print the maximum and minimum number respectively among three numbers*/
public class ProgramFour {
	public static void maximum(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " is the greatest number");
		} else if (b > c) {
			System.out.println(b + " is the greatest number");
		} else {
			System.out.println(c + " is the greatest number");
		}
	}

	public static void minimum(int a,int b,int c) {
		if (a < b && a < c) {
			System.out.println(a + " is the less than number");
		} else if (b < c) {
			System.out.println(b + " is the less than number");
		} else {
			System.out.println(c + " is the less than number");
		}
	}
	
	public static void main(String[] args) {
		ProgramFour.maximum(30, 21, 40);
		ProgramFour.minimum(40, 50, 25);
	}

}
