package SDET_InterviewQuestions_Set3;

import java.util.HashSet;

public class ExerciseNine {
//Remove duplicate characters

	public static void main(String[] args) {
		String str = "java leason";

		int n = str.length();

		StringBuilder sb = new StringBuilder();

		HashSet<Character> myset = new HashSet<Character>();

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (myset.contains(ch)) {
				continue;
			} else {
				myset.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}

}
