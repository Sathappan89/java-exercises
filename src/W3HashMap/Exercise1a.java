package W3HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercise1a {

	public static void main(String[] args) {
		HashMap<Integer, String> EmployeeDetails = new HashMap<Integer, String>();
		EmployeeDetails.put(1, "Sathappan");
		EmployeeDetails.put(2, "Rajini");
		EmployeeDetails.put(3, "Hanuman");
		EmployeeDetails.put(4, "Ganesh");
		EmployeeDetails.put(5, "KalaBhairva");

		System.out.println(EmployeeDetails.entrySet());// [1=Sathappan, 2=Rajini, 3=Hanuman, 4=Ganesh, 5=KalaBhairva]
		System.out.println(EmployeeDetails.keySet());// [1, 2, 3, 4, 5]
		System.out.println(EmployeeDetails.values());// [Sathappan, Rajini, Hanuman, Ganesh, KalaBhairva]

		System.out.println("------------for each loop-------------");

		for (Map.Entry<Integer, String> entry : EmployeeDetails.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("------------iterator-------------");
		

		Iterator<Entry<Integer, String>> test = EmployeeDetails.entrySet().iterator();
		
		while(test.hasNext()) {
			System.out.println(test.next());
		}
		
		
		Set set = EmployeeDetails.keySet();
		System.out.println(set);
		
		 System.out.println(EmployeeDetails.get(3));
		 
		 String result =(String)EmployeeDetails.get(3);
		 System.out.println(result);
		 
		 if(EmployeeDetails.containsValue("Sathappan")) {
			 System.out.println("true"+ EmployeeDetails.get(1));
		 }
		 
		 
		 System.out.println("------------Specific Key-------------");
		
		 for (Entry<Integer, String> entry : EmployeeDetails.entrySet()) {
			    if (entry.getValue().equals("Sathappan")) {
			        System.out.println("Key = " + entry.getKey());
			    }
			}
		 
	}

}
