package W3HashMap;

import java.util.HashMap;

public class Exercise5 {
//Check If Map is Empty
/*Write a Java program to check whether a map contains key-value mappings (empty) or not.*/	
	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Blue");
		hash_map.put(3, "White");
		hash_map.put(4, "Green");
		hash_map.put(5, "Grey");
		System.out.println("The Original linked map: " + hash_map); // {1=Red, 2=Blue, 3=White, 4=Green, 5=Grey}
		
		boolean isResult = hash_map.isEmpty();
		System.out.println(isResult);
		
		System.out.println("Check If Map is Empty " + isResult);
		
		hash_map.clear();
		
		boolean isResult2 = hash_map.isEmpty();
		System.out.println(isResult2);
		
		
	}

}
