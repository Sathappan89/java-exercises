package Constructor;

public class Cars {

	String name;
	int price;
	String licenseNum;
	double mileage;
	boolean isAvailable;

	public Cars(String name, int price) {
		// this.global = local
		this.name = name;
		this.price = price;

		sendMail();
	}

	public void sendMail() {
		System.out.println("SendMail");
	}

	public static void main(String[] args) {
		Cars c1 = new Cars("BMW x1", 50);

	}

}
