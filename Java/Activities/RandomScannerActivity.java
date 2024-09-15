package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan= new Scanner(System.in);
      ArrayList<Integer> list= new ArrayList<Integer>();
      Random indexGen=new Random();
     
      while(scan.hasNextInt())
      {
    	 list.add(scan.nextInt());
      }
      Object[] nums= list.toArray());
      indexGen.ints();
      
	}

}
