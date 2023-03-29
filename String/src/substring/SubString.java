package substring;
import java.util.*;
	
public class SubString {

	String Example(String rr, int x, int y)
	{
		char ol[]=rr.toCharArray();
		char ne[]=new char[x-y+1];
		int j=0;
		
		for(int i=x; i<=y; i++)
		{
			ne[j]=ol[i];
			j++;
		}
		
		String res=new String(ne);
		return res;
		
		
	}
	
	
	
	
}
	
	class Sub
	{
		public static void main(String [] args)
		{
		Scanner scan=new Scanner(System.in);
		SubString ss=new SubString();
		System.out.println("enter main String");
		String s=scan.nextLine();
		
		System.out.println("enter strting index");
		int a=scan.nextInt();
		
		System.out.println("enter ending index");
		int b=scan.nextInt();
		
		String res=ss.Example(s,a,b);
		
		
		
		
	}
	
}
