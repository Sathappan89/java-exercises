package SDET_InterviewQuestions_Set3;

import java.util.Arrays;

public class ExerciseSeven {
	/* Count words in a sentence */
	public static void main(String[] args) {
		String str = "I live java tesing";
		String words[] = str.split(" ");
		System.out.println(Arrays.toString(words)); // [I, live, java, tesing]
		System.out.println(words.length);

		System.out.println("---Actual Logic---");

		int countNumberofSpace = 0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)==' ') {
				countNumberofSpace++;
			}
		}
		System.out.println("Number of words : " + (countNumberofSpace + 1));
	}

}
