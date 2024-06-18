package activities;

import java.util.Arrays;

public class Activity3 {
	

	static double EarthSeconds = 31557600;
	static double MercurySeconds = 0.2408467;
	static double VenusSeconds = 0.61519726;
	static double MarsSeconds = 1.8808158;
	static double JupiterSeconds = 11.862615;
	static double SaturnSeconds = 29.447498;
	static double UranusSeconds = 84.016846;
	static double NeptuneSeconds = 164.79132;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double seconds = 1000000000;
		System.out.println("The ages are : "+Arrays.toString(ageInplanets(seconds)));
		
	}

	private static double[] ageInplanets(double seconds) {
		double[] ages= new double[8];
	    ages[0]=seconds/EarthSeconds;
	    ages[1]=ages[0]/MercurySeconds;
	    ages[2]=ages[0]/VenusSeconds;
	    ages[3]=ages[0]/MarsSeconds;
	    ages[4]=ages[0]/JupiterSeconds;
	    ages[5]=ages[0]/SaturnSeconds;
	    ages[6]=ages[0]/UranusSeconds;
	    ages[7]=ages[0]/NeptuneSeconds;
		return ages;
	}

}
