package Pkg1;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] a1={"abc","123"};
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
		Object[] obj=new Object[2];
		obj[0]=1;
		obj[1]="value";
		
		for(int i=0;i<2;i++)
		{
			System.out.println(obj[i]);
		}

		ArrayList<String> a = new ArrayList<String>();
		
		// To add elements
		a.add("ABC");
		a.add("123");
		System.out.println(a);

		// To add elements at index
		a.add(0, "Student");
		System.out.println(a);
		
		//To remove index
		a.remove(1);
		System.out.println(a);
		
		//To remove string
		a.remove("123");
		System.out.println(a);
		
		//To delete all elements
		a.removeAll(a);
		System.out.println(a);
		
		//To add duplicate
		a.add("abc");
		a.add("def");
		System.out.println(a);
		
		//To print the string at given index
		System.out.println(a.get(1));
		
		//To check whether string or other datatype is present or not
		System.out.println(a.contains("defddf"));
		
		//To knoe the index of element
		System.out.println(a.indexOf("def"));
		
		//To check array is empty or not
		System.out.println(a.isEmpty());
		
		//To check total elements in arraylist,
		System.out.println(a.size());
		
		
		
		
		

	}

}
