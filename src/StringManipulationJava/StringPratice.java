package StringManipulationJava;

import java.util.Arrays;

public class StringPratice {

	public static void main(String[] args) {

		String str = "I love to learn Java and Selenium";
		
		System.out.println("--------------IndexOf Method and its Overloaded Method Pratices-----------------");

		System.out.println(str.indexOf("e")); // 5
		
		int eFirstOccurrence = str.indexOf("e");
		
		System.out.println(str.indexOf("e", eFirstOccurrence+1)); //11
		
		int eSecondOccurrence = str.indexOf("e", eFirstOccurrence+1);
		
		System.out.println(str.indexOf("e", eSecondOccurrence+1));//26
		
		int eThirdOccurrence = str.indexOf("e", eSecondOccurrence+1);
		
		System.out.println(str.indexOf("e", eThirdOccurrence+1)); //28

		System.out.println("------------Sub String Pratice - One-------------------");
		
		String orderMessage = "My Want to Learn Java in 30 days";
		
		System.out.println(orderMessage.substring(0));
		System.out.println(orderMessage.substring(0, 24));
		System.out.println(orderMessage.substring(orderMessage.indexOf("in") + 2, orderMessage.length()).trim());
		
		System.out.println("------------Sub String Pratice - Two with subString ; indexOf ; length and trim -------------------");
		
		String testing ="Find my number 98765";
		System.out.println(testing.substring(testing.indexOf("r")+2,testing.length()));
		
		
		//split:
		String lang = "java_ruby_python_go_javascript_typescript";
		String []lg=lang.split("_");
		System.out.println(Arrays.toString(lg));
		
		
		System.out.println("------------ String Pratice - One-------------------");
		
		Studentname("dhoni");
		
	}

	
	public static void Studentname(String name) {
		String xpath="//input[text()='" + name +"']";
		System.out.println(xpath);
	}
	
}