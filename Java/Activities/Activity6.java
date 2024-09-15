package activities;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          Plane plane=new Plane(10);
          Scanner input=new Scanner(System.in);
          System.out.println("Please enter 10 passenger name");
          for(int i=0;i<10;i++)
          {
        	  plane.onboard(input.nextLine());
      	}
          
         System.out.println("The take of time:"+plane.takeOff());
         System.out.println("The passengers are:"+plane.getPassesngers().toString());
         Thread.sleep(5000L);
         plane.land();
         System.out.println("The land of time:"+plane.getLastTimeLanded());
         System.out.println("The passengers after landing :"+plane.getPassesngers().toString());
          }
        

}
