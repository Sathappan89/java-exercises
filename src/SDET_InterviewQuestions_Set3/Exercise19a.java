package SDET_InterviewQuestions_Set3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

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

		for (Entry<Character, Integer> x : map.entrySet()) {
			System.out.println(x.getKey() + " = " + x.getValue());
		}

		System.out.println("------------------------------------------------");
		
		Iterator<Entry<Character,Integer>>  y =map.entrySet().iterator();
		while(y.hasNext()) {
			System.out.println(y.next());
		}
		return map;
	}

	public static void main(String[] args) {
		String str = "Sathappan";

		HashMap<Character, Integer> result = countCharFrequency(str);
		System.out.println("----------------------Main--------------------------");
		System.out.println(result);
		System.out.println(result.entrySet());
		System.out.println(result.keySet());
		System.out.println(result.values());
	}

}
