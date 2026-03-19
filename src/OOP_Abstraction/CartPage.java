package OOP_Abstraction;

public class CartPage extends Page {

	@Override
	public void title() {
		System.out.println("CP--Title");
		
	}

	@Override
	public void url() {
		System.out.println("CP---Url");
		
	}
	
	@Override
	public void timeOut() {
		System.out.println("time out: 15 secs");
	}

}
