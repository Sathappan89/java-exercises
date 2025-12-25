package SDET_InterviewQuestions_Set1;

/*Java Program to swap two numbers without using third variable*/
public class P4_SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		System.out.println("Before Swapping a " + a);
		System.out.println("Before Swapping b " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("***********************");

		System.out.println("After Swapping a " + a);
		System.out.println("After Swapping b " + b);

	}

}
