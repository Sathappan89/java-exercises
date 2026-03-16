package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();

		fh.dentalServices(); // US-----Dental Services
		fh.entServices(); // US-----ENT Services
		fh.physioServices(); // US-----Physio Services
		fh.orthoServices(); // US-----ortho Services

		fh.oncologyServices(); // UK-----Oncology Services
		fh.pediaServices(); // UK-----Oncology Services

		fh.ratioServices(); // INDIAN-----Ratio Services
		fh.opticalServices(); // INDIAN-----Optical Services
		fh.cardioServices(); // INDIAN-----Cardio Services

		fh.emergencyServices(); // Common -- Method

		fh.medicalTraining(); // Individual Method

		System.out.println("-------------------------------------------");

		/* Interface object are not allowed */
		// USMedical us=new USMedical(); - This is not allowed because no Implementation
		// in the Interface class

		System.out.println("---------------------TOP CASTING = US Medical ----------------------");
		// Top Casting:
		USMedical us = new FortisHospital();

		us.dentalServices();
		us.entServices();
		us.physioServices();
		us.orthoServices();

		us.emergencyServices();

		System.out.println("---------------------TOP CASTING = UK Medical ----------------------");

		UKMedical uk = new FortisHospital();
		uk.oncologyServices();
		uk.pediaServices();
		uk.emergencyServices();

		System.out.println("---------------------TOP CASTING = INDIAN Medical ----------------------");

		IndianMedical im = new FortisHospital();
		im.ratioServices();
		im.opticalServices();
		im.cardioServices();
		im.emergencyServices();

		// Multiple Inheritance is allowed.
		// Class can implements n number of interfaces 

	}

}
