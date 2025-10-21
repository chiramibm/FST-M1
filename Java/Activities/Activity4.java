package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] sort= {5,3,7,6,8,2,9};
		int temp;
		for(int i=1;i<sort.length;i++)
		{
			if(sort[i]<sort[i-1])
			{
				temp=sort[i];
				sort[i]=sort[i-1];
				sort[i-1]=temp;
			}
		}
		System.out.println(Arrays.toString(sort));
		

	}

}
