package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration ; Heterogeneous
		// ArrayList mylist = new ArrayList();
		// List mylist = new ArrayList();

		// Homogeneous value in Arraylist ; Primitive datatype is not allowed
		// ArrayList<Integer> mylist = new ArrayList<Integer>();
		// ArrayList<Employee> mylist1 = new ArrayList<Employee>();

		// Adding data into ArrayList
		// Adding means end of list
		ArrayList mylist = new ArrayList();
		mylist.add(10);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(null);
		mylist.add('A');
		mylist.add(null);
		mylist.add(true);

		// Size if arraylist
		System.out.println("Size of an arraylist : " + mylist.size()); // Size of an arraylist : 7

		// Printing arraylist
		System.out.println("Printing data from arraylist :" + mylist); // Printing data from arraylist :[10, 10.5,
																		// welcome, null, A, null, true]
		// Remove element from arraylist
		mylist.remove(5); // Here 5 is index of element
		System.out.println("After removing: " + mylist); // After removing: [10, 10.5, welcome, null, A, true]

		// Insert element in the arraylist
		mylist.add(5, "testingadd");
		System.out.println("Adding indexing in the 5 index: " + mylist);

		mylist.add(2, "java");
		System.out.println("After insertion in the 2 index : " + mylist);

		// Modify the element in the arraylist (modify/replace/change)
		mylist.set(2, "python");
		System.out.println("After Replacing in the 2 index : " + mylist);

		// Access specific element from arraylist
		mylist.get(3);
		System.out.println(mylist.get(3)); // Here 2 is index
		System.out.println("-----------for loop with index-----------");
		// Reading all the elements from arraylist
		// 1. Reading all the elements in the arraylist - Using normal for loop
		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}
		System.out.println("---------for each loop-------------");
		// 2. for each loop
		for (Object x : mylist) {
			System.out.println(x);
		}
		System.out.println("----------iterator method  (iterator means cursor)------------");
		// 3. Specific to using iterator
		Iterator<Object> it = mylist.iterator();
		System.out.println("****first value in the arraylist*** : " + it.next());
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------True / False------------");
		//Checking arraylist is empty or not
		System.out.println(mylist.isEmpty());
		

		System.out.println("----------Remove all the elements from array list ------------");
		ArrayList mylist2 = new ArrayList();
		mylist2.add(10.5);
		mylist2.add("welcome");
	
		mylist.removeAll(mylist2);
		System.out.println("Remove elements randomly " + mylist);
		
		System.out.println("----------Remove all the elements  ------------");		
		mylist.clear();
		System.out.println("Is arraylist empty ? : " +mylist.isEmpty());
	}
}
