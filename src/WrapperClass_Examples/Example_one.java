package WrapperClass_Examples;
//Wrapper classes let Java treat primitive values as objects, enabling them to work seamlessly with collections, generics, and APIs.
public class Example_one {
	public static void main(String[] args) {
		// Convert String to Integer
        String str = "100";
        Integer num = Integer.valueOf(str);

        System.out.println("String value: " + str);
        System.out.println("Converted Integer value: " + num);
	}
}