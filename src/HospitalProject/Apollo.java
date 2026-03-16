package HospitalProject;

public class Apollo extends HospitalClass{
	
	@Override
	public void treatPatient() {
		System.out.println("Treat the partient - Apollo Class");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharge the partient - Apollo Class");
	}

	public void performSurgery() {
		System.out.println("perform Surgery");
	}
	
}
