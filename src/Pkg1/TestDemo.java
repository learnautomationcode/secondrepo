package Pkg1;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Hello World";
		char[]a= str.toCharArray();
		int count =0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[count++])
			{
				a[count++]=a[i];
				//count++;
			}
		}
		System.out.println(count);

	}

}
