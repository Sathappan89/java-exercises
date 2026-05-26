package JavaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EWSJavaHashMap {
	public static void main(String[] args) {
		String[] names = { "Philp", "Philp", "Debbie", "Annie", "Debbie", "Annie", "Debbie", "Annie" };
		Double[] marks = { 10.0, 20.0, 40.0, 100.0, 60.0, 70.0, 60.0, 20.0 };

		int numOfEntries = names.length;

		HashMap<String, List<Double>> map = new HashMap<>();

		// Part A: How to put values from names and marks into HashMap
		for (int i = 0; i < numOfEntries; i++) {
			map.putIfAbsent(names[i], new ArrayList<Double>());
			map.get(names[i]).add(marks[i]);
		}

		// Part B : Iterate through HashMap
		for (Map.Entry<String, List<Double>> e : map.entrySet()) {
			String name = e.getKey();

			// Part C: Give a list of marks, calculate the avg and print pass or fail
			List<Double> solo_marks = e.getValue();
			int solo_entries = solo_marks.size();
			double sum = 0;

			for (int i = 0; i < solo_entries; i++) {
				sum += solo_marks.get(i);
			}
			double avgScore = sum / solo_entries;

			if (avgScore > 50) {
				System.out.println(name + "  " + avgScore + " : Pass");
			} else {
				System.out.println(name + "  " + avgScore + " : Fail");
			}

		}

	}

}
