package Pkg1;

import java.util.HashMap;
import java.util.Scanner;

public class JavaProgramsRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//countWords();
	//	countOccurence();
	//	sortArray();
		prime();
		//SortDescending();
		//sumOfFirstAndLastDigit();
		//sumOfDigitOfNumber();
		//sumarray();
		//printChristmasTree();
		//reverseString();
		//reversewordsinString();
		
		
	}
	
	//COunt  occurence of each character in a string
	public static void countOccurence()
	{
		String str="Hello World";
		HashMap<Character, Integer> mapcount=new HashMap<>();
		
		for(Character c:str.toCharArray())
		{
			if(mapcount.containsKey(c))
			{
				mapcount.put(c, mapcount.get(c)+1);
			}
			else
			{
				mapcount.put(c,1);
			}
		}
		System.out.println(mapcount);
	}
	
	//COunt  occurence of each character in a string
		public static void countWords()
		{
			String str="HelloWorld";
			HashMap<Character, Integer> mapcount=new HashMap<>();
			
			for(Character c:str.toCharArray())
			{
				//if(mapcount.containsKey(c))
				//{
					//mapcount.put(c, mapcount.get(c)+1);
					mapcount.put(c,1);
				//}
				//else
				//{//}
					
			}
			System.out.println(mapcount);
		}
	
	
	public static void prime()
	{
		int num=7;
		boolean flag=true;
		
		for(int i=2;i<=num/2;i++)
		{
		if(num%2==0)
		{
			flag=false;
			break;
			//System.out.println(num+" is  prime");
			
		}
		}
		if(flag)
		{
			System.out.println(num+" is  prime");
		}
		else {
			//flag=true;
			System.out.println(num+" is not prime");
		}
		
		
		
	}
	
	
	
	//Sort 0s AND 1s in an array
	public static void sortArray()
	{
		int a[]= {1,0,0,1,0};
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[j++]=a[i];
				
			}
			
		}
		while(j<a.length)
		{
			a[j++]=1;
			
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
	}
	
	//Sort in descending order
	public static void SortDescending()
	{
		int a[]={1,7,4,2,8,9};
		int temp=0;
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int k=0;k<a.length-1;k++)
		{
			System.out.print(a[k]+" ");
		}
		
		System.out.print(a[a.length-1]+" ");
		
		
		
		
	}
	
		
		
		
		
	

	// Sum of first and last digit
	public static void sumOfFirstAndLastDigit()
	{
		int num=12345;
		
		int lastdigit=num%10;
		
		int firstdigit=num;
		while(firstdigit>10)
		{
			firstdigit=firstdigit/10;
		}
		System.out.println(firstdigit+lastdigit);
		
	}
	
	// Sum of  digits of a number
		public static void sumOfDigitOfNumber()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number for sum of digits");
			
			int num=s.nextInt(); //123
			
			int sum=0; 
			int digit=0;
			
			while(num>0)
			{
				
				digit=num%10; //3 2 1
				sum=sum+digit;//0+3+2+1
				num=num/10;//12 1 0
				
				
			}
			System.out.println(sum);
				
		
		}
	
	// Print addition of an array
		public static void sumofarray()
		{
		int array[]= {1,2,3,4};
		
		//int count=array.length;
		
		
		int sum=0;
		
		for(int i :array)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		}

		
		public static void printChristmasTree()
		{
		
//			for(int i=0;i<5;i++)
//			{
//				for(int j=5-i;j>1;j--)
//				{
//					System.out.print(" ");	
//				}
//				
//				for(int k=0;k<=i;k++)
//				{
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//			
			for(int i=0;i<6;i++)
			{
				for(int j=5-i;j>0;j--)
				{
					System.out.print(" ");
				}
				
				for(int k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();
				
			}
			
			
			
			
			
			
		}
		
		public static void reverseString()
		{
			String str="Prabhat Saxena";
			char[] a=str.toCharArray();
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.print(a[i]);
			}
			
		}
		public static void reversewordsinString()
		{
			String str="Prabhat Saxena";
			//char[] a=str.toCharArray();
			String[] a=str.split(" ");
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.print(a[i]);
			}
			
		}

}
