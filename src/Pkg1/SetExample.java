package Pkg1;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("abc");
		hs.add("def");
		hs.add("ghi");
		hs.add("jkl");
		
		System.out.println(hs);
		
		//Try to add duplicate value, it should not be added
		hs.add("def");
		System.out.println(hs);
		
		//To remove
		//hs.remove("def");
		System.out.println(hs);
		
		// To check hashset is empty
		System.out.println(hs.isEmpty());
		
		// To check hashset size
		System.out.println(hs.size());
		
		//To iterate
		     Iterator<String> it=  hs.iterator();
		     while(it.hasNext())
		     {
		    	// it.next();
		    	 System.out.println(it.next());
		     }
		     
		   
	}

}
