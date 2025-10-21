package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres=4;
	int doors=4;
	
	public Car(String color,String transmission,int make)
	{
	this.color=color;
	this.transmission=transmission;
	this.make=make;
	}
	
	public void displayCharacteristics() {
		System.out.println("the color is: "+color);
		System.out.println("the tranmission type is: "+ transmission);
		System.out.println("The car was made in: "+make);
		System.out.println("It has "+doors+" doors");
		System.out.println("It has "+tyres+" tyres");
		
	}
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("car has stopped");
	}
}
