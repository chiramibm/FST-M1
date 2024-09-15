package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] nums= {4,7,1,9,6,5};
          System.out.println("Array before sorted :"+Arrays.toString(nums));
          int temp;
         for(int i=0;i<nums.length;i++)
         {
        	 if(nums[i]<nums[0])
        	 {
        		 temp=nums[0];
        		 nums[0]=nums[i];
        		 for(int j=0;j<i;j++)
        		 {
        			 
        		 }
        	 }
         }
	}

}
