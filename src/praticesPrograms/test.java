package praticesPrograms;

public class test {

	public static void main(String[] args) {
		
		String name = "testing";
		
		switch (name.toLowerCase().trim()) {
		case "test":
			System.out.println("test");
			break;
		case "testing":
			System.out.println("test is passed");
			break;
		default:
			System.out.println("closed");
			break;
		}
	}
}