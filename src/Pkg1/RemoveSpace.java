package Pkg1;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="i am here";
		
		char[] aray=sentence.toCharArray();
		
		int final1=0;
		
		for(int i=0;i<aray.length;i++)
		{
			if(aray[i]!=' ')
			{
				aray[final1++] =aray[i];
				
			}
		}
		
		System.out.println(String.valueOf(aray).subSequence(0, 7));
		
		
		
		
		
		
	}

}
