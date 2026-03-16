package HospitalProject;

public class TestHospital {

	public static void main(String[] args) {
		HospitalClass th=new HospitalClass();
		th.admitPatient(); //Individual Method
		th.dischargePatient();//Individual Method
		th.treatPatient();//Individual Method
		
		System.out.println("----------------------------------------------");
		Apollo ap=new Apollo();
		ap.admitPatient(); //Inherited Method
		ap.dischargePatient(); //Override Method
		ap.treatPatient(); //Override method
		ap.performSurgery(); //Individual Method
		System.out.println("----------------------------------------------");
		
		HospitalClass HC=new Fortis();
		HC.admitPatient(); //Inherited Method
		HC.dischargePatient(); //Override method
		HC.treatPatient();	 //Override method	


	}

}
