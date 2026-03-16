package InterfaceConceptAssignment;

public class USStudent implements College , PreSchool, School{

	@Override
	public void collegeStudent() {
		System.out.println("College Student");
	}

	@Override
	public void numberofCourses() {
		System.out.println("Number of Courses");
	}

	@Override
	public void numberofStudent() {
		System.out.println("Number of Student");
	}

	@Override
	public void schoolStudent() {
		System.out.println("Number of  Student common");
	}

	@Override
	public void numberofClasses() {
		System.out.println("Number of Classes Student");
	}

	@Override
	public void preStudent() {
		System.out.println("Number of  pre student");
	}

	@Override
	public void kg1() {
		System.out.println("Number of  kgOne");
	}

	@Override
	public void kg2() {
		System.out.println("Number of  kgTwo");
	}

}
