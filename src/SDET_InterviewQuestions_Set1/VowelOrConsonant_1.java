package SDET_InterviewQuestions_Set1;

public class VowelOrConsonant_1 {

	public static void main(String[] args) {

		char alpha = 'A';

		switch (String.valueOf(alpha).toLowerCase()) {
		case "a":
			System.out.println(alpha + " is a vowel");
			break;
		case "e":
			System.out.println(alpha + " is a vowel");
			break;
		case "i":
			System.out.println(alpha + " is a vowel");
			break;
		case "o":
			System.out.println(alpha + " is a vowel");
			break;
		case "u":
			System.out.println(alpha + " is a consonant");
			break;
		default:
			break;
		}

	}

}
