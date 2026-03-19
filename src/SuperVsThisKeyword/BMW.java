package SuperVsThisKeyword;

public class BMW extends Car{
	
	int min_speed = 200;
	
	public BMW() {
		System.out.println("BMW class default constructor");
	}
	
	public BMW(int i) {
		super(i);
		System.out.println("BMW class single param " + i);
	}
	
	public BMW(int i,int j) {
		super(i,j);
		System.out.println("BMW class double param" + i + j);
	}
	
	@Override
	public void start() {
		System.out.println("BMW----Start");
		super.start();
	}

	public void displaySpeed() {
		System.out.println(min_speed);
		System.out.println(super.min_speed);
		int carSpeed=super.min_speed;
	}
	
}
