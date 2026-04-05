package W3HashMap;

import java.util.HashMap;

public class Exercise4 {
//Write a Java program to remove all mappings from a map//
	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Blue");
		hash_map.put(3, "White");
		hash_map.put(4, "Green");
		hash_map.put(5, "Grey");
		System.out.println("The Original linked map: " + hash_map); // {1=Red, 2=Blue, 3=White, 4=Green, 5=Grey}

		hash_map.clear();
		System.out.println("The New Map : " + hash_map); //The New Map : {}

	}

}
