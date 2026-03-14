package MethodAssignments;

public class functionOddorEven {
	
	public static int evenOdd(int number) {
		if(number%2==0) {
			System.out.println("Number is even number");
		}
		else {
			System.out.println("Number is odd number");
		}
		return number;
	}

	public static void main(String[] args) {
		int a = functionOddorEven.evenOdd(51);
		System.out.println(a);
		

	}

}
