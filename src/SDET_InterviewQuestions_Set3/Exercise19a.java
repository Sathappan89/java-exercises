package SDET_InterviewQuestions_Set3;

import java.util.HashMap;

public class Exercise19a {

	public static HashMap<Character, Integer> countCharFrequency(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length() - 1; i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		return map;
	}

	public static void main(String[] args) {
		String str = "Sathappan";

		HashMap<Character, Integer> result = countCharFrequency(str);
		System.out.println(result);
		System.out.println(result.entrySet());
		System.out.println(result.keySet());
		System.out.println(result.values());
	}

}
