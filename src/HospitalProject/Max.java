package HospitalProject;

public class Max extends HospitalClass{
	
	@Override
	public void treatPatient() {
		System.out.println("Treat the partient - Max Class");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharge the partient - Max Class");
	}

	public void conductTests() {
		System.out.println("Conduct Tests");
	}
	
}
