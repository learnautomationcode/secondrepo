package Pkg1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PhonebookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> phonebook=new HashMap<>();
		
		phonebook.put("Rahul", "12345689");
		phonebook.put("Rohit", "12345389");
		phonebook.put("John", "12325389");
		
		System.out.println(phonebook);
		
		
		Set<String> keys=phonebook.keySet();
		for(String i: keys)
		{
			System.out.println(i +":"+ phonebook.get(i));
		}
		
		//Using MAp.entry
		
		Set<Map.Entry<String,String>> values= phonebook.entrySet();
		
		for(Map.Entry<String,String> i: values)
		{
			System.out.println(i.getKey()+":"+ i.getValue());
		}
		
		
		/*
		Set<String> keys=phonebook.keySet(); // gives all the keys
		
		for(String i:keys)
		{
			System.out.println(i+ ":" +phonebook.get(i));
		}
		
		//Using Map.Entry
		Set<Map.Entry<String, String>> values=  phonebook.entrySet(); //gives the set
		for(Map.Entry<String, String> i: values)
		{
			System.out.println(i.getKey()+ ":" +i.getValue());
			System.err.println(i.setValue("I"));
		}*/
		
		
		
		
				
	}

}
