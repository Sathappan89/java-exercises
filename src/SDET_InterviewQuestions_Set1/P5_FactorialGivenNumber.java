package SDET_InterviewQuestions_Set1;

public class P5_FactorialGivenNumber {
	/* Java Program to Find Factorial on given Number */
	public static void main(String[] args) {
		
		int a = 5;
		int fact =1;
		for(int i=a;i>=1;i--) {
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
