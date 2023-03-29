package Swap2;
import java.util.*;

public class Sw2 {
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	int a;
	int help;
	
	System.out.println(" enter length of array");
	a=scan.nextInt();
	
	int arr[]=new int[a];
	
	System.out.println(" enter the elements of array");
	
	for(int x=0; x<=arr.length-1; x++)
	{
		System.out.println(" enter " +x+ " element ");
		arr[x]=scan.nextInt();
	}
	
	System.out.println(" Array contents before swapping are");
	
	for(int x=0; x<=arr.length-1; x++)
	{
		System.out.print("   " +arr[x]);	
	}
		
	System.out.println();
	
	
	System.out.println(" enter 1st element to swap");
	
	int b=scan.nextInt();
	
	System.out.println(" enter 2nd element to swap");
	
	int c=scan.nextInt();
	
	System.out.println(" Before Swaping" +arr[b]+ "and "+arr[c]);
	
	help=arr[b];
	arr[b]=arr[c];
	arr[c]=help;
	
	
System.out.println(" Array contents after swapping are");
	
	for(int x=0; x<=arr.length-1; x++)
	{
		System.out.print("   " +arr[x]);	
	}
	
	
	
	
	
	
	
	
	
}
}
