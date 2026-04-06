package SDET_InterviewQuestions_Set3;

public class ExerciseTwo {
	/* Reverse without reverse() method */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String input = "automation";
		for (int i = input.length()-1; i >=0; i--) {
			sb.append(input.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
