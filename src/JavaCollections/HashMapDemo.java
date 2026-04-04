package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declaration
		HashMap hm1 = new HashMap();
		Map hm3 = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");

		System.out.println(hm); // {101=John, 102=David, 103=Mary, 104=Scott}
		System.out.println("Size of hashMap " + hm.size()); // 4

		// remove pair
		hm.remove(103);
		System.out.println("After removing pairs:" + hm);

		// access value of the key
		System.out.println(hm.get(102));

		// get all the keys for hashMap
		System.out.println(hm.keySet());// [101, 102, 104]

		// get all the values of hasMap
		System.out.println(hm.values()); // [John, David, Scott]

		System.out.println(hm.entrySet()); // [101=John, 102=David, 104=Scott]

		// Reading data from hashMap
		// Using for..each
		System.out.println("------For Each Loop-----");
		for (int k : hm.keySet()) {
			System.out.println(k + " " + hm.get(k));
		}
		System.out.println("------Iterator-----");

		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
			// System.out.println(it.next());
		}

		hm.clear();
		System.out.println(hm.isEmpty());

	}

}
