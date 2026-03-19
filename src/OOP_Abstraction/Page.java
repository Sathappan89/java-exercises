package OOP_Abstraction;

public abstract class Page {

	// abstract class: can not have the object
	
	//Can Have :
		//Only abstract methods: 100% abstraction
		//Only non-anstract methods
		//Both abstract + non abstract methods: partial abstraction
		//0 to 100% abstraction range
	
	//can not create the object of the abstract class
	//But we can create the constructor of the abstract class it will called when we create the object of the child class

	
	public Page() {
		System.out.println("--Page default Constrcutor--");
	}
	
	public Page(int i) {
		System.out.println("--One Constrcutor--" + i);
	}
	
	public Page(int i,int j) {
		System.out.println("-Two Constrcutor--"+i +j);
	}
	
	
	public abstract void title(); //abstract keyword is mandatory whereas abstract keyword is not mandatory interface
	public abstract void url();

	public final void displayLogo() {
		System.out.println("display logo");
	}

	public void timeOut() {
		System.out.println("time out: 10 secs");
	}

	public static void displayFooter() {
		System.out.println("Page --- Same footer link");
	}

}
