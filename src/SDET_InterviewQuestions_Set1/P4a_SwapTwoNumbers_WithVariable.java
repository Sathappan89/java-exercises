package SDET_InterviewQuestions_Set1;
/*Java Program to swap two numbers with using third variable*/
public class P4a_SwapTwoNumbers_WithVariable {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);

	}

}
