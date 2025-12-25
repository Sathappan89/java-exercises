package SDET_InterviewQuestions_Set1;

/*Max and Min*/
public class MaxNumber_ShortcircuitOperator_2 {

	public static void main(String[] args) {

		int a = 100;
		int b = 564;
		int c = 300;

		if (a > b && a > c) { //F && --Increase the performance
			System.out.println("Max Number is " + a);
		} else if (b > c) {
			System.out.println("Max Number is " + b);
		} else {
			System.out.println("Max Number is " + c);
		}

	}

}
