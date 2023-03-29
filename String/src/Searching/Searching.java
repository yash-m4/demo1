package Searching;
import java.util.*;
public class Searching {
boolean Check(String ss, String rr)
{
	char ar[]=ss.toCharArray();
	char as[]=rr.toCharArray();
	
	for(int i=0; i<=ar.length-1;i++)
	{
		if(ar[i]==as[0])
		{
			return true;
		}
		
	}
	return false;
}

}

class SearchingApp
{
	public static void main(String args[])
	{
		String s=" how are you?";
		String r="o";
		
		Searching sss=new Searching();
		boolean bo=sss.Check(s,r);
		if (bo==true)
		{
			System.out.println("o is prensent");
			
		}
		else {
		System.out.println("o is not prensent");
		}
		
		
		
		
	}
	
	
	
}

