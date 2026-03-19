package OOP_Abstraction;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("LP---Default constructor");
	}
	
	public LoginPage(int i) {
		System.out.println("LP---Default constructor" + i);
	}
	
	public LoginPage(int i,int j) {
		System.out.println("LP---Default constructor" + i + j);
	}

	@Override
	public void title() {
		System.out.println("LP -- Title");
	}

	@Override
	public void url() {
		System.out.println("Display -- Logo");
	}
	
	@Override
	public void timeOut() {
		System.out.println("time out: 5 secs");
	}
	
	//Static Method can't method Override. Method Hiding
	public static void displayFooter() {
		System.out.println("LoginPage --- Same footer link");
	}

	public void doLogin(String un,String pw) {
		System.out.println("Individal Method");
	}
	
}
