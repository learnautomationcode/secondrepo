package Pkg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> phonebook= new HashMap<String, Integer>();
		
		phonebook.put("ABC", 123566789);
		phonebook.put("xyz", 123564789);
		phonebook.put("pqr", 123266789);
		
		System.out.println(phonebook);
		
		//to get value based on key
		System.out.println(phonebook.get("xyz"));
		
		//IF you specify key which is not present, null value will be printed.
		System.out.println(phonebook.get("xz"));
		
		//remove value with the help of key,
		System.out.println(phonebook.remove("pqr"));
		
		System.out.println(phonebook);
		
		
		//Entryset- return entry
		
		Set s=phonebook.entrySet();// convert map into set
		
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry map=(Map.Entry)it.next(); // to get key and value as seperate value
			
			System.out.println(map.getKey());
			System.out.println(map.getValue());
			
			
			
		}
		
		
		
		
		
		
		

	}

}
