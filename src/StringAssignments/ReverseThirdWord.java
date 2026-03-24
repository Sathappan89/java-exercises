package StringAssignments;

import java.util.Arrays;

public class ReverseThirdWord {

	public static String reverseThird(String str) {
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Input cannot be null or empty");
		}

		String[] words = str.split(" ");

		if (words.length < 3) {
			return str;
		}

		String third = words[2];
		StringBuilder rev = new StringBuilder();

		for (int i = third.length() - 1; i >= 0; i--) {
			rev.append(third.charAt(i));
		}
		words[2] = rev.toString();
		
		System.out.println(words[2]);
		
		return String.join(" ", words);
	}

	public static void main(String[] args) {
		String str = "I love Java coding";
		
		String[] test = str.split(" ");
		System.out.println(Arrays.toString(test));
		
		System.out.println(reverseThird(str));
	}

}
