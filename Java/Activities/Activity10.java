package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<String> hs=new HashSet<String>();
     hs.add("test1");
     hs.add("test2");
     hs.add("test3");
     hs.add("test4");
     hs.add("test5");
     hs.add("test6");
     System.out.println("The initial set is :");
     for(String s:hs)
     {
    	 System.out.println(s);
     }
     
     System.out.println("the size of the hashset is "+hs.size());
     System.out.println("Removing test2 from the set :"+hs.remove("test2"));
     hs.remove("test7");
     System.out.println("The element is present/not :"+hs.contains("test5"));
     System.out.println("The final set is :");
     for(String s:hs)
     {
    	 System.out.println(s);
     }
     
     
	}

}
