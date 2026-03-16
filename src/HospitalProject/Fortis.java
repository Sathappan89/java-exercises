package HospitalProject;

public class Fortis extends HospitalClass{
	
	@Override
	public void treatPatient() {
		System.out.println("Treat the partient - Fortis Class");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharge the partient - Fortis Class");
	}
	
	public void prescribeMedication() {
		System.out.println("prescribe Medication");
	}

}
