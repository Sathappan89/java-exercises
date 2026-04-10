package SDET_InterviewQuestions_Set3;

public class ExerciseFive {
//Reverse word order in a sentence
	public static void main(String[] args) {
		String str = "Java learn QA Strings";
		String[] words = str.split(" ");
		int n = words.length;
		int left = 0;
		int right = n - 1;

		while (left < right) {
			String temp = words[left];
			words[left] = words[right];
			words[right] = temp;
			left++;
			right--;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(words[i]);
			if (i != n-1) {
				sb.append(" ");
			} 
		}
		System.out.println(sb.toString());

	}
}
