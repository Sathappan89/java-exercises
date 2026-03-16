package OOP_Interface;

public interface UKMedical extends WHO {
	
	public void oncologyServices();
	
	public void pediaServices();

	public void emergencyServices();
	
	//Method hiding
	public  static void  billing() {
		System.out.println("Uk Medical");
	}
}
