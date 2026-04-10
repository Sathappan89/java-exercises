package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class countCharacter {
	/* Count the character */

	public static HashMap<Character, Integer> countChar(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		System.out.println("-------------For Each Loop------------------");
		for (Map.Entry<Character, Integer> x : map.entrySet()) {
			System.out.println(x);
		}

		System.out.println("-------------For Each Loop - Part 2------------------");
		for (Map.Entry<Character, Integer> y : map.entrySet()) {
			System.out.println(y.getKey() + " --> " + y.getValue());
		}

		System.out.println("-------------Iterator------------------");

		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		return map;
	}

	public static void main(String[] args) {
		String str = "Sathappan Annamalai Sathappan";
		HashMap<Character, Integer> result = countCharacter.countChar(str);
		System.out.println(result);
		System.out.println(result.entrySet());
		System.out.println(result.values());
		System.out.println(result.keySet());
	}

}
