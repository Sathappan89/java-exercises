package JavaTopCasting;

public class Testing {

	public static void main(String[] args) {
		Car c = new BMW();
		c.engine();
		c.start();
		
		System.out.println("-------------");
		
		Vehicle v=new BMW();
		v.list();
		v.start();

	}

}
