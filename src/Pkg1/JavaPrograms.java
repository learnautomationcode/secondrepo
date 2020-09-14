package Pkg1;

import java.util.HashMap;
import java.util.Scanner;

public class JavaPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///int t= countOccurencea();
		//System.out.println(t);
		//String str=reverseStringreturn("Hello World");
		//System.out.println(str);
		//missingNumber();
		//palindrome();
	//	countWords();
	//	countletters();
	//	countOccurence();
		//sortArray();
	//	prime();
		//SotDescending();
		//sumOfFirstAndLastDigit();
		//sumOfDigitOfNumber();
		//sumarray();
		//printChristmasTree();
		//reverseString();
		//reversewordsinString();
		
		
	}
	
	public static int countOccurencea () 
	{
	int  x, count = 0;
	int arr[]={2,3,4,3,2,1};

	  x = 3;
	        for(int i = 0; i < arr.length; i++)
	        {
	            if(arr[i] == x)
	            {
	                count++;
	            }
	        }
	     return count;
	}

	
	
	public static String reverseStringreturn(String str)
	{
	//	String str="Happy";
		char[] a=str.toCharArray();
		String reverse="";
		for(int i=a.length-1;i>=0;i--)
		{
		  reverse=reverse+a[i];
		}
		
		String str1=new String(reverse);
		return str1;
		
	}
	
	public static void missingNumber()
	{
		 int[] arr={7,5,6,1,3,2};
		 int n=arr.length+1;
		  int sum=n*(n+1)/2;
		  int restSum=0;
		  for (int i = 0; i < arr.length; i++) {
		   restSum=restSum+arr[i];
		  }
		  int missingNumber=sum-restSum;
		  System.out.println(missingNumber);
	}
	
	
	public static void palindrome()
	{
		String str="1212";
		//char[]c=str.toCharArray();
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(reverse.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{

			System.out.println("not palindrome");
		}
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
	
	//count letters in a string
	public static void countletters()
	{
		String str="Hello World is";
	
		String[] words=str.split(" ");
		System.out.println(words.length);
		String letter=str.replace(" ", "");
		
		System.out.println(letter.length());
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println("letters are:"+ words[i]);
		}
	
	
	
	}

	
	//COunt  words in a string
		public static void countWords()
		{
			String str="Hello World is there";
		
			String words[]=str.split(" ");
			System.out.println(words.length);
			
			for(int i=0;i<words.length;i++)
			{
				System.out.println("words are:"+ words[i]);
			}
		
		
		
		}
	
	
	public static void prime()
	{
		int num=8;
		boolean Isprime=true;
		int temp=0;
		
		for (int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				Isprime=false;
				break;
			}
		}
		if(Isprime)
		{
			System.out.println("num is prime");
		}
		else
		{
			System.out.println("num is not prime");
		}
		
		
	}
	
	
	
	//Sort 0s AND 1s in an array
	public static void sortArray()
	{
		int a[]={0,1,1,0,1,0};
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			a[j++]=a[i];
		}
		
		while(j<a.length)
		{
			a[j++]=1;
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]);
		}
	}
	
	//Sort in descending order
	public static void SotDescending()
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
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+",");
		}

		System.out.print(a[a.length-1]);
		
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
			String str="Happy";
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
