package W3HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;
/*Write a Java program to associate the specified value with the specified key in a HashMap.*/
public class Exercise1 {

	public static void main(String[] args) {
		
		HashMap <String,String> EmployeeDetails= new HashMap<String,String>();
		EmployeeDetails.put("name1","Sathappan");
		EmployeeDetails.put("name2","Rajini");
		EmployeeDetails.put("name3","Hanuman");
		EmployeeDetails.put("name4","Ganesh");
		EmployeeDetails.put("name5","KalaBhairva");
		
		System.out.println(EmployeeDetails); //{name5=KalaBhairva, name4=Ganesh, name3=Hanuman, name2=Rajini, name1=Sathappan}
		
		System.out.println(EmployeeDetails.keySet()); //[name5, name4, name3, name2, name1]
		System.out.println(EmployeeDetails.values()); //[KalaBhairva, Ganesh, Hanuman, Rajini, Sathappan]
		System.out.println(EmployeeDetails.entrySet()); //[name5=KalaBhairva, name4=Ganesh, name3=Hanuman, name2=Rajini, name1=Sathappan]
		
		
		System.out.println("------for each loop----------");
		
		for(Map.Entry<String, String> entry : EmployeeDetails.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("------Iterator----------");
		

		Iterator<Entry<String, String>> itr=EmployeeDetails.entrySet().iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------Iterator2----------");
		
		Iterator<Map.Entry<String, String>> itr2 = EmployeeDetails.entrySet().iterator();

		while (itr2.hasNext()) {
		    Map.Entry<String, String> entry = itr2.next();
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
