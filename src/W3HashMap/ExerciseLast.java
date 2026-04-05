package W3HashMap;

import java.util.Map.Entry;
import java.util.*;

public class ExerciseLast {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		System.out.println(hash_map.keySet()); // [1, 2, 3, 4, 5]
		System.out.println(hash_map.get(1)); // Red
		System.out.println(hash_map.values());// [Red, Green, Black, White, Blue]
		System.out.println(hash_map.entrySet());// [1=Red, 2=Green, 3=Black, 4=White, 5=Blue]

		System.out.println("--Loop----");

		for (Entry<Integer, String> x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

		System.out.println("--Iterator----");

		Iterator<Entry<Integer, String>> test = hash_map.entrySet().iterator();

		while (test.hasNext()) {
			System.out.println(test.next());
		}

		System.out.println("--Sepcific key----");

		for (Entry<Integer, String> x : hash_map.entrySet()) {
			if (x.getValue().contains("Blue")) {
				System.out.println(x.getKey() + " " + x.getValue());
			}
		}

	}

}
