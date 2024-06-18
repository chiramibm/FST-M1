package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] num={10,77,10,54,-11,10};
      System.out.println("Original Array: " + Arrays.toString(num));
	
		// TODO Auto-generated method stub
    	  int sum=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==10)
			{
				sum=sum+num[i];
			}
		}
		System.out.print("So the result is :");
		if(sum==30)
			System.out.println(true);
		else
			System.out.println(false);
	}

}
