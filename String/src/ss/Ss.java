package ss;
import java.util.*;

public class Ss {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String a=scan.nextLine();
		
		char arr[]=a.toCharArray();
		System.out.println(arr);
				
		char arr2[]=new char[arr.length];
	
		for(int i=0; i<=arr.length-1; i++)
		{
			if (arr[i]==' ')
            {
			arr2[i]=arr[i];
				
			}
		}
		
		
		int j=arr2.length;
		for(int i=0; i<=arr2.length-1; i++)
		{
			if(arr[i]!=' ')
			{
				if(arr2[i]==' ')
				{
					j--;
				}
				
				
				arr2[j]=arr[i];
				j--;
			
			}
			
		}
		
		
	
		
		
		
		
		String str=new String(arr2);
		System.out.println(str);
		
	}

}
