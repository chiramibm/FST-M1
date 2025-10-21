package activities;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		
		Scanner inputAge=new Scanner(System.in);
		System.out.println("enter the age in seconds");
		double calcAge=inputAge.nextDouble();
		
		double earth=calcAge/31557600;
		double mercury= 0.2408467*earth;
		double venus=0.61519726*earth;
		double mars=1.8808158*earth;
		double jupiter=11.862615*earth;
		double saturn=29.447498*earth;
		double uranus=84.016846*earth;
		double neptune=164.79132*earth;
		
		System.out.println("the given age is "+earth+" Earth-years old");
		System.out.println("the given age is "+mercury+" Earth-years old in mercury");
		System.out.println("the given age is "+venus+" Earth-years old in venus");
		System.out.println("the given age is "+mars+" Earth-years old in mars");
		System.out.println("the given age is "+jupiter+" Earth-years old in jupiter");
		System.out.println("the given age is "+saturn+" Earth-years old in saturn");
		System.out.println("the given age is "+uranus+" Earth-years old in uranus");
		System.out.println("the given age is "+neptune+" Earth-years old in neptune");
		
		

	}

}
