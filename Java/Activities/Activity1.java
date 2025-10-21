package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car honda = new Car("Black", "Automatic", 2020);
		//print details of the car
		honda.displayCharacteristics();
		//move the car
		honda.accelarate();
		//stop the car
		honda.brake();
	}

}
