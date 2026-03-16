package VehicleProject;

public class Car extends Vehicle{
	
	public int numDoors;
	
	public void playMusic() {
		System.out.println("Play the music");
	}
	@Override
	public void start() {
		System.out.println("Start the Car");
	}
	
}
