package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical{
 
	// US Medical
	@Override
	public void dentalServices() {
		System.out.println("US-----Dental Services");
	}

	@Override
	public void entServices() {
		System.out.println("US-----ENT Services");
	}

	@Override
	public void physioServices() {
		System.out.println("US-----Physio Services");
	}

	@Override
	public void orthoServices() {
		System.out.println("US-----ortho Services");

	}

	// UK Medical
	@Override
	public void oncologyServices() {
		System.out.println("UK-----Oncology Services");

	}

	@Override
	public void pediaServices() {
		System.out.println("UK-----Oncology Services");
	}

	// Indian Medical
	@Override
	public void ratioServices() {
		System.out.println("INDIAN-----Ratio Services");
	}

	@Override
	public void opticalServices() {
		System.out.println("INDIAN-----Optical Services");
	}

	@Override
	public void cardioServices() {
		System.out.println("INDIAN-----Cardio Services");
	}

	@Override
	public void emergencyServices() {
		System.out.println("Common----Method");
	}

	// Individual Method

	public void medicalTraining() {
		System.out.println("Individual Method");
	}

	@Override
	public void covidVaccination() {
		System.out.println("Common GrandParend Interface Method");
		
	}
	
	@Override
	public void medicalPolicy() {
		System.out.println("USM---medical policy");
	}

}