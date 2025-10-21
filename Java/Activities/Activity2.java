package activities;

public class Activity2 {

	public static void main(String[] args) {
		int[] data= {10,77, 10, 54, -11, 10};
		int sum=0;
		for(int a:data) {
			if(a==10)
			{
				sum+=a;
				if(sum>30) {
					break;
				}
			}
		}
        if(sum==30) {
        	System.out.println("sum is 30");
        }else
        {
        	System.out.println("sum is not 30");
        }
	}

}
