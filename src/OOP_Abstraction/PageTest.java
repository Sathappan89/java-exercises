package OOP_Abstraction;

public class PageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.timeOut();
		lp.url();
		lp.timeOut();
		lp.displayFooter();
		
		LoginPage.displayFooter();	
		Page.displayFooter();
		
		lp.doLogin("Satha", "tester");
		
		System.out.println("------------------------");
		
		//
		CartPage cp=new CartPage();
		cp.title();
		cp.url();
		cp.timeOut();
		cp.displayLogo();
		cp.displayFooter();

		
		System.out.println("------------------------");
		
		//Page pg=new LoginPage();
		
		
		/*Note Abstract class also we can't create the object same like interface*/
		
		//TOP Casting
		//Child class object can be referred by abstract class reference variable
		
		Page pg=new LoginPage();
		pg.title();
		pg.url();
		pg.timeOut();
		pg.displayLogo();
		//pg.doLogin(); //Can't access the child class individal method
		
		//downCasting : NA
	}

}
