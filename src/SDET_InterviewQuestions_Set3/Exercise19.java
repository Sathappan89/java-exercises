package SDET_InterviewQuestions_Set3;

import java.util.HashMap;

//Count frequency of each word
public class Exercise19 {

	public static void main(String[] args) {

		String str = "Sathappan";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length() - 1; i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
