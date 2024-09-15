package activities;

public class Activity12 {
   public static void main(String[] args)
   {
	   Addable ad1=(num1,num2)->(num1+num2);
	   ad1.add(100, 200);
	   System.out.println("The first sum"+ad1.add(100, 200));
	   Addable ad2=(int num1,int num2)->{return num1+num2;};
	  System.out.println("The second sum"+ad1.add(500, 200));
	  
   }

   
}
