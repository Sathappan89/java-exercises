package JavaEncapsulation;

public class Person {

	private String name;
	private int age;
	private String gender;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public void printInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getGender());
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Sathappan");
		p1.setAge(37);
		p1.setGender("M");
		p1.printInfo();
	}
}