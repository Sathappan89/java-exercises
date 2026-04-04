package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		// Declaration
		// Heterogenies Data

		// HashSet myset = new HashSet();
		// Set myset = new HashSet();

		// Homogeneous Data
		// HashSet <String> myset = new HashSet<String>();

		HashSet myset = new HashSet();

		// 1. Adding elements into HashSet
		myset.add(100);
		myset.add(10.50);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(100);

		myset.add(null);
		myset.add(null);

		System.out.println("size of the hash set " +myset.size());
		
		// Printing HashSet
		System.out.println(myset); // [null, A, 100, 10.5, welcome, true]

		// Removing element from the hashSet
		myset.remove(10.5); // 10.5 is value (not a index)
		System.out.println("After removing: " + myset); // After removing: [null, A, 100, welcome, true]

		// Inserting element is not possible in the set collection - only add

		// Access specific elements - Not Possible
		//we can convert set collection into arraylist collection
		
		//Convert HashSet --> ArrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));

		//Read all the elements using for..each loop
		System.out.println("--------set collection read from For EACH Loop------");
		for(Object x:myset) {
			System.out.println(x);
		}
		
		//Using Iterator
		System.out.println("--------set collection read from For Iterator------");
		Iterator <Object>it = myset.iterator(); 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
		
		//Set - we can't remove multiple values	
		//clearing all the elements in hashSet
		
		myset.clear();
		System.out.println(myset.isEmpty());
		
		
	}

}
