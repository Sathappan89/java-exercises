package W3HashMap;

import java.util.HashMap;

public class Exercise3 {
// Copy Mappings to Another Map
	public static void main(String[] args) {
		HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Green");
		hash_map1.put(3, "Yellow");
		hash_map1.put(4, "Orange");
		hash_map1.put(5, "Grey");
		System.out.println(hash_map1);
		HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
		hash_map2.put(6,"White");
		hash_map2.put(7,"Blue");
		hash_map2.put(8,"DarkGreen");
		System.out.println(hash_map2);
		
		hash_map1.putAll(hash_map2);
		System.out.println(hash_map1);
		
	}

}
