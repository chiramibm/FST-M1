package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<>();
		myList.add("test");
		myList.add("check");
		myList.add("myname");
		myList.add(3,"orgin");
		myList.add(1,"sweet");
System.out.println("Printing all elements");
		for (String list : myList) {
         System.out.println(list);
		}
		System.out.println("The third element: "+myList.get(2));
		System.out.println("The element is present/not :"+Activity9.check(myList,"isexist"));
	System.out.println("The size of array list is :"+myList.size());
       myList.remove(3);
       System.out.println("The size of array list post removal :"+myList.size());
      System.out.println("post removed element present");
       for (String list : myList) {
           System.out.println(list);
  		}
	}
	public static boolean check(ArrayList<String> s,String t)
	{
		if(s.contains(t))
		return true;
		else
			return false;
		
	}
}