package StringManipulationJava;
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

		System.out.println("------------Sub String-------------------");
		
		String orderMessage = "My Want to Learn Java in 30 days";
		
		System.out.println(orderMessage.substring(0));
		System.out.println(orderMessage.substring(0, 24));
		
		
		System.out.println(orderMessage.substring(orderMessage.indexOf("in") + 2, orderMessage.length()).trim());
		
	}

}