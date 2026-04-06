package SDET_InterviewQuestions_Set3;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class PickaSpecificWord {

	public static HashMap<Integer, String> wordPick(String str) {
		String[] words = str.split(" ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < words.length; i++) {
			map.put(i, words[i]);
		}

		for (String x : map.values()) {
			if (x.equals("learning")) {
				System.out.println("learning");
			}
		}
		System.out.println("---------");
		
		 for (Map.Entry<Integer,String> y : map.entrySet()){
			 if (y.getValue().equals("Java")){
	            System.out.println(y.getKey() + " " + y.getValue());
	            }
			}

		return map;

	}

	public static void main(String[] args) {
		String str = "I love learning Java Exercises";
		PickaSpecificWord.wordPick(str);
	}

}
