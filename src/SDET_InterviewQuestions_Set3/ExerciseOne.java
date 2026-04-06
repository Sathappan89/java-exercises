package SDET_InterviewQuestions_Set3;
/*Reverse a String*/
public class ExerciseOne {
	public static String Reverse(String str) {
		if (str == null) {
			throw new RuntimeException("String is empty");
		}
		if (str.length() == 0) {
			return str;
		}
		if (str.length() == 1) {
			return str;
		}
		String reverseResult = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseResult = reverseResult + str.charAt(i);
		}
		return reverseResult;
	}

	public static void main(String[] args) {
		String str = "Java";
		String result = ExerciseOne.Reverse(str);
		System.out.println(result); //avaJ
	}

}