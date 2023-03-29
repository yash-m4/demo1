package how;
import java.util.*;
public class How {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s=scan.nextLine();
	char arr[]=s.toCharArray();
	char ary[]=new char[arr.length];
	
	int j=ary.length-1;
	for(int i=0; i<=arr.length-1;i++)
	{
		ary[j]=arr[i];
		j--;
	}
	String ss=new String(ary);
	String arz[]=ss.split(" ");
	
	for(int i=arz.length-1;i>=0;i--)
	{
System.out.print(arz[i]+" ");
	}
	
		
		
		
		
	}

}
