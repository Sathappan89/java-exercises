package W3HashMap;

import java.util.HashMap;

public class Exercise7 {
//Check If Key Exists in Map
	public static void main(String[] args) {
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
		hash_map.put("Red", 1);
		hash_map.put("Green", 2);
		hash_map.put("Black", 3);
		hash_map.put("White", 4);
		hash_map.put("Blue", 5);

		if (hash_map.containsKey("Green")) {
			System.out.println(hash_map.get("Green"));
		} else {
			System.out.println("No!");
		}
		System.out.println("-----*****------------------");
		if (hash_map.containsKey("Orange")) {
			System.out.println(hash_map.get("Orange"));
		} else {
			System.out.println("No!");
		}

	}

}
