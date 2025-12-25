package SDET_InterviewQuestions_Set1;

public class MinNumber_ShortCircuitOperator_3 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 564;
		int c = 70;
		
		if (a < b && a < c) { //F && --Increase the performance
			System.out.println("Min Number is " + a);
		} else if (b < c) {
			System.out.println("Min Number is " + b);
		} else {
			System.out.println("Min Number is " + c);
		}
	}

}
