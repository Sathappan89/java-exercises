package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPratice {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);
		map.put('g', 7);

		System.out.println(map); // {a=1, b=2, c=3, d=4, e=5, f=6, g=7}
		System.out.println(map.entrySet()); // [a=1, b=2, c=3, d=4, e=5, f=6, g=7]
		System.out.println(map.values());// [1, 2, 3, 4, 5, 6, 7]
		System.out.println(map.keySet()); // [a, b, c, d, e, f, g]
		System.out.println(map.get('a'));// 1
		System.out.println(map.get('c'));// 3

		System.out.println("-------------");
		for (Map.Entry<Character, Integer> x : map.entrySet()) {
			System.out.println(x.getKey() + " = " + x.getValue());
		}

		System.out.println("-------------");
		Iterator y = map.entrySet().iterator();
		while (y.hasNext()) {
			System.out.println(y.next());
		}
		System.out.println("-----Find Specific Value-----");
		for (Map.Entry<Character, Integer> d : map.entrySet()) {
			if (d.getValue().equals(5)) {
				System.out.println(d.getKey() + " = " + d.getValue());
			}
		}
		System.out.println("----Find Specific Key------");
		for (Map.Entry<Character, Integer> dd : map.entrySet()) {
			if (dd.getKey().equals('g')) {
				System.out.println(dd.getKey() + " = " + dd.getValue());
			}
		}

	}

}
